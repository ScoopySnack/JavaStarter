package gr.aueb.cf.practice.ch2;

import java.util.Scanner;

/**
 * count steps up, distance down by one
 */
public class CounterApp {

    public static void main(String[] args) {
        int steps = 0, distance;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the desired distance to measure:");
        distance = scanner.nextInt();

        do {
            steps++;
            distance--;
        }while (distance > 0);

        System.out.printf("You will do %d steps and at the end the remained distance will be %d.", steps, distance);
    }
}
