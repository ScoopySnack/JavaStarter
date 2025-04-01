package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {
            System.out.println("Insert a num to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret Found!!");
                isSuccess = true;
            } else {
                System.out.println("Try again!");
            }
        }while (!isSuccess);
    }
}

