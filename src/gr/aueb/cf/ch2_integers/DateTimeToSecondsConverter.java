package gr.aueb.cf.ch2_integers;

import java.util.Scanner;

/**
 * Converts date, hours, min, sec to total seconds from a standard input
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR =3600;
        final int SECONDS_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inDays;
        int inHours;
        int inMin;
        int inSec;
        int totalSec;

        System.out.println("Please insert days, hours, minutes, seconds");
        inDays = in.nextInt();
        inHours = in.nextInt();
        inMin = in.nextInt();
        inSec = in.nextInt();

        totalSec = inDays * SECONDS_PER_DAY + inHours * SECONDS_PER_HOUR + inMin * SECONDS_PER_MINUTE + inSec;

        System.out.printf("Total seconds: %,d seconds\n", totalSec);
    }
}
