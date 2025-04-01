package gr.aueb.cf.ch4_char_forSwitch;

import java.util.Scanner;

/**
 * Demo of for
 */
public class FlexibleFor {

    public static void main(String[] args) {
        int startVal;
        int endVal;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;

        System.out.println("Please enter start, end, step:");
        startVal = scanner.nextInt();
        endVal = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startVal; i <= endVal ; i+= step) {
            iterations++;
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.println("Iterations:" + iterations);;
    }
}
