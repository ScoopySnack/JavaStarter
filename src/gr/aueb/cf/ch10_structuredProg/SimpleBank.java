package gr.aueb.cf.ch10_structuredProg;

import java.util.Scanner;

/**
 * A simple bank account
 */
public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)  {
        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }
        try {
            withdraw(200);
        } catch (Exception e) {
            System.out.println("An error happened. Try again...");
        }
    }

    /**
     * Deposits money to the account
     * @param amount the amount to deposit
     * @throws Exception if the amount is negative or zero
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Error. Amount: " + amount + " must not be negative or zero.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }

    /**
     * Withdraws money from the account
     * @param amount the amount to withdraw
     * @throws Exception if the amount is negative or zero
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Error. Amount: " + amount + " must not be negative or zero.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Error. Amount: " + amount + " is lees than balance: " + balance);
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);    // log
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());             // log
            throw e;
        }
    }
}
