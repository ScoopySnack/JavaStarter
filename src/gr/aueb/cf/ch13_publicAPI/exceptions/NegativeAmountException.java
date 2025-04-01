package gr.aueb.cf.ch13_publicAPI.exceptions;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(double amount){
        super("Amount " + amount + " is sufficient.");
    }



}
