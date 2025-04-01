package gr.aueb.cf.ch2_integers;

import java.util.Scanner;

/**
 * Converts Euro to USD&cents
 * 99 cents = 1Eu
 */

public class EuroUsdConverter {
    public static void main(String[] args) {

//      Δήλωση και αρχικοποήση Μεταβλητών
        Scanner in = new Scanner(System.in);
        int amountEu;
        int totalUSD;
        int amountUsd;
        int cents;
        final int PARITY = 99;

//      Εντολές
        System.out.println("Please insert the amount in Euro:");
        amountEu = in.nextInt();

        totalUSD = amountEu * PARITY;
        amountUsd = totalUSD / 100;
        cents = totalUSD % 100;


//      Εκτύπωση αποτελέσματος
        System.out.printf("%d € = %d $ , %d usa cents", amountEu, amountUsd, cents);


    }
}
