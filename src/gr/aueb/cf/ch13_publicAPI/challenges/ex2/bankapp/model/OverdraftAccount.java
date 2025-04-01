package gr.aueb.cf.ch13_publicAPI.challenges.ex2.bankapp.model;

/**
 * Δίνει τη δυνατότητα ανάληψης ποσών μεγαλύτερων από το υπόλοιπο του λογαριασμού
 */
public class OverdraftAccount {
    private double balance;
    private double overdraftLimit;

    public OverdraftAccount() {
    }

    public OverdraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void overdraft(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Δεν επαρκεί το υπόλοιπο του λογαριασμού");
        } else {
            balance -= amount;
        }
    }


}
