package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts miles to km.
 */
public class MilesToKm {

    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        double inputMil = 0.0;
        double kilometers = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert miles");
        inputMil = in.nextDouble();

        kilometers = inputMil * KM_PER_MILE;

        System.out.println("Miles: " + inputMil + ", Km: " + kilometers);

    }
}
