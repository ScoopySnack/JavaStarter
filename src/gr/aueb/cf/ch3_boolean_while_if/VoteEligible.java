package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18
 * Ελέγχει αν μια ηλικία έχει δικαίωμα να ψηφίσει
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean isEligible = false;
        final int VOTING_AGE = 18;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.printf("You are a %b eligible", isEligible);
    }
}
