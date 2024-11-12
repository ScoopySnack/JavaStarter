package gr.aueb.cf.ch3.challenges;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα έτος είναι δίσεκτο, δηλαδή αν έχει 366 μέρες
 */

public class Disekto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean einaiDisekto;
        int year;

        System.out.println("Please insert the year:");
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            einaiDisekto = true;
        } else einaiDisekto = year % 400 == 0;

        System.out.printf("Το έτος %d είναι %b δίσεκτο. ", year, einaiDisekto);


    }
}
