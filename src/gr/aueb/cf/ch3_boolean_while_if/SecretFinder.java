package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Υπάρχει ένα SECRET που είναι integer και ο χρήστης με μία μνο
 * προσπάθεια θα προσπαθήσει να τον βρει.
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET){
            System.out.println("Secret Found!!");
        } else {
            System.out.println("Try again!");
        }
    }
}
