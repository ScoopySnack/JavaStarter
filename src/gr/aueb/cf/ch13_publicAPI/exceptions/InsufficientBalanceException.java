package gr.aueb.cf.ch13_publicAPI.exceptions;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(double balance, double amount){
        super("Insufficient balance: " + balance + " to withdraw " + amount);
    }
}
