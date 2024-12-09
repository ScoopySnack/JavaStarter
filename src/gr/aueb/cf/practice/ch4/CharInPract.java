package gr.aueb.cf.practice.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Practice of char
 */
public class CharInPract {

    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character:");
        //ch = (char) System.in.read(); //το read διαβάζει μόνο bytes, δεν καταλαβαίνει ελληνικά
        ch =scanner.nextLine().charAt(0);
        System.out.printf("%c", ch);

    }
}
