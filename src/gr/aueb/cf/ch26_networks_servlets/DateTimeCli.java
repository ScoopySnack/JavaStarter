package gr.aueb.cf.ch26_networks_servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DateTimeCli {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Socket socket = null;
        BufferedReader bf = null;

        try {
            InetAddress servAddress = InetAddress.getByName("time.nist.gov");
            //InetAddress is a class that represents an IP address
            int servPort = 13;

            socket = new Socket(servAddress, servPort);
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //We use a BufferedReader to read the response from the server.

            String line = "";

            //We need a loop to read the response line by line
            while ((line = bf.readLine()) != null) {
                sb.append(line).append("\n");
            }

            System.out.println("Daytime server response: " + sb.toString());

        }catch (IOException e) {
//            System.out.println("Cannot connect to the server");
//            System.exit(1);
            e.printStackTrace();
        }finally {
            try {
                if (socket != null) socket.close();
                if (bf != null) bf.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
