package gr.aueb.cf.ch26_networks_servlets;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Για ταυτόχρονη εξυπηρέτηση πολλών πελατών χρειαζόμαστε concurrent servers. (Asynchronous Servers)
 * Η βασική ιδέα είναι ότι ο Server δημιουργεί αντίγραφο του εαυτού του κάθε φορά
 * που δέχεται και εξυπηρετεί μία νέα σύνδεση.
 */
public class ConcurrentDayTimeServer implements Runnable{
    private final Socket sockFd;

    public ConcurrentDayTimeServer(Socket sockFd) {
        this.sockFd = sockFd;
    }

    /**
     * Η μέθοδος run() υλοποιεί τη λογική του thread.
     */
    @Override
    public void run() {
        try(BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(sockFd.getOutputStream()))){
            bf.write(new Date().toString());
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
