package gr.aueb.cf.ch9_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class PrintStreamWithMethod {

    public static void main(String[] args) {

        //try(PrintStream ps = new PrintStream("C:/tmp/file-ps.txt", StandardCharsets.UTF_8)){
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file-ps.txt", true))) {

            printMessage(ps, "Hello Coding Factory!");
            printMessage(System.out, "Hello CF!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * Generic PrintStream method
     *
     * @param ps      the input method
     * @param message the input message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }

}

