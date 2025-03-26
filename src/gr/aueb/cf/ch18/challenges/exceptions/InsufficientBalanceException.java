package gr.aueb.cf.ch18.challenges.exceptions;

public class InsufficientBalanceException extends Exception{
    private final double balance;
    private final double amount;

    public InsufficientBalanceException(double balance, double amount) {
        super("Error: Insufficient balance. Balance: " + balance + ", Amount: " + amount);
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
