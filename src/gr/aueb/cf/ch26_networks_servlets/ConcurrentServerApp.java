package gr.aueb.cf.ch26_networks_servlets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentServerApp {
    private static final int PORT = 13;

    public static void main(String[] args) {
        try(var servFd = new ServerSocket();){
            servFd.bind(new InetSocketAddress("localhost", PORT));
            System.out.println("Server started on port " + PORT);

            for(;;){
                Socket connFd = servFd.accept();
                Thread socketThread = new Thread(new ConcurrentDayTimeServer(connFd));
                socketThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
