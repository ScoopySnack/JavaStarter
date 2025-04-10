package gr.aueb.cf.ch26_networks_servlets;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoCli {

    public static void main(String[] args) {
        Socket sockFd = null;

        try (Scanner in = new Scanner(System.in)) {
            InetAddress servAddress = InetAddress.getByName("127.0.0.1");
            final int SERV_PORT = 7;

            sockFd = new Socket(servAddress, SERV_PORT);
            PrintWriter pw = new PrintWriter(sockFd.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sockFd.getInputStream()));
            String line = "";

            do {
                System.out.println("Insert a string to echo. BYE for exit.");
                line = in.nextLine();
                pw.println(line);
                pw.flush();
                System.out.println(br.readLine());
            } while (!line.equals("BYE"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sockFd != null) sockFd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
