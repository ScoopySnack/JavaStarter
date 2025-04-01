package gr.aueb.cf.ch2_integers.challenges2;

import java.util.Scanner;

/**
 * Μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ που δίνονται απο τον χρήστη σε κλίμακα Κελσίου
 * και εκτυπώνει με κατάλληλο μήνυμα το αποτέλεσμα.
 * Ο τύπος μετατροπής είναι 5/9(Φ-32).
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

//        Δηλώσεις και αρχικοποιήσεις
        int inputFahrenheit;
        int celsius;
        Scanner in = new Scanner(System.in);

//        Εντολές
        System.out.println("Please insert a Fahrenheit temperature:");
        inputFahrenheit = in.nextInt();

        celsius = 5 * (inputFahrenheit - 32)/9;

        System.out.printf("%d Fahrenheit is %d Celsius", inputFahrenheit, celsius);


    }
}
