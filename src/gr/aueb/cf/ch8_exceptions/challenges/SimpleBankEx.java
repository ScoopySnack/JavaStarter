package gr.aueb.cf.ch8_exceptions.challenges;

import java.util.Scanner;

public class SimpleBankEx {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true){
            System.out.println("---Simple Bank Menu");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            try {
                switch (choice){
                    case 1:
                        deposit(50);
                        break;
                    case 2:
                        withdraw(100);
                        break;
                    case 3:
                        System.out.println("Current balance: $" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using Simple Bank. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }catch (Exception e) {
                System.out.println("Something happened. Try again...");
            }

        }

    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Amount must be less than balance.");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }
}
