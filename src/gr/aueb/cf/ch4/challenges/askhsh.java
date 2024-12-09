package gr.aueb.cf.ch4.challenges;

import java.util.Scanner;

/**
 * Αναπτύξτε πέντε προγράμματα αντίστοιχα με τα προηγούμενα όπου
 * ο χρήστης θα δίνει το πλήθος των stars, έστω n
 * – n οριζόντια αστεράκια,
 * – n κάθετα,
 * – nxn,
 * – από 1 έως n,
 * – από n έως 1
 */
public class askhsh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Please enter a number of stars:");
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
