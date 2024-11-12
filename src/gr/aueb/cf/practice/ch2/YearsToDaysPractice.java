package gr.aueb.cf.practice.ch2;

import java.util.Scanner;

/**
 * Convert years(ages) to days
 */
public class YearsToDaysPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, days;
        final int DAYS_PER_YEAR = 365;

        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        System.out.printf("You are %d days old.", days);
    }
}
