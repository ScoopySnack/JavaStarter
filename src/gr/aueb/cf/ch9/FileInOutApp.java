package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/file.txt");
        File outFd = new File("C:/tmp/file-out.txt");

        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()){
                String line = in.nextLine();
                String[] tokens = line.split("\\s+");

                for(String token : tokens){
                    //System.out.print(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
