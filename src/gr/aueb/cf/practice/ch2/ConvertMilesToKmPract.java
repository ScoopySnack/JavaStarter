package gr.aueb.cf.practice.ch2;

import java.util.Scanner;

/**
 * Convert miles to km.
 */
public class ConvertMilesToKmPract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputMiles, outKm;
        final double M_TO_KM = 1.61;

        System.out.println("Please insert the desired miles to be converted:");
        inputMiles = scanner.nextDouble();

        outKm = inputMiles * M_TO_KM;

        System.out.printf("The given distance in km is: %.2f", outKm);


    }
}
