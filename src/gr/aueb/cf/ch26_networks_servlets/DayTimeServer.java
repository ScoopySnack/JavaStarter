package gr.aueb.cf.ch26_networks_servlets;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DayTimeServer extends Thread{

    @Override
    public void run() {
        ServerSocket servFd;
        final int servPort = 13;

        try {
            servFd = new ServerSocket();
            servFd.bind(new InetSocketAddress("localhost", servPort), 10);
            //Θέτουμε εμείς το όριο των συνδέσεων σε 10, χρησιμοποιώντας την bind() με τον ServerSocket.
            //Αν δε θέσουμε το όριο, τότε θα χρησιμοποιηθεί το default όριο 50.

            while (true){
                Socket connFd = servFd.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connFd.getOutputStream()));
                bw.write(new Date().toString());
                bw.flush();
                connFd.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
