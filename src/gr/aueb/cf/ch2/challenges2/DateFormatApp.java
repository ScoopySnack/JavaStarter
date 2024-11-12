package gr.aueb.cf.ch2.challenges2;

import java.util.Scanner;

/**
 * The program reads 3 integers from std in that show the day, month and year and prints it in the format DD/MM/YY
 */
public class DateFormatApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("Please state the date you want to be formated:");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        year = year % 100;

        System.out.printf("The formated date is: %02d/%d/%d", day, month,year);


    }
}
