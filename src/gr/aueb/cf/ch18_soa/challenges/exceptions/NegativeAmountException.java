package gr.aueb.cf.ch18_soa.challenges.exceptions;

public class NegativeAmountException extends Exception{
    private final double amount;

    public NegativeAmountException(double amount) {
        super("Error: Negative amount " + amount + " is not allowed.");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }



}
