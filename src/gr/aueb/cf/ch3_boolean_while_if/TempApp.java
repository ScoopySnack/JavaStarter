package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 *Λαμβάνει μια θερμοκρασία από τον χρήστη και εμφανίζει κατάλληλο μήνυμα
 */
public class TempApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int temp;
        boolean isTempBelowZero;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp <0;

        System.out.println("Temperature is below zero: " + isTempBelowZero);

    }
}
