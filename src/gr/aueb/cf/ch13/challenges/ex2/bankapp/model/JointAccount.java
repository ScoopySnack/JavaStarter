package gr.aueb.cf.ch13.challenges.ex2.bankapp.model;
import gr.aueb.cf.ch13.challenges.ex2.bankapp.model.OverdraftAccount;

public class JointAccount {
    private String owner1;
    private String owner2;
    private double balance;
    OverdraftAccount account = new OverdraftAccount();

    public JointAccount() {
    }

    public JointAccount(String owner1, String owner2) {
        this.owner1 = owner1;
        this.owner2 = owner2;
        this.account = new OverdraftAccount();
    }

    public String getOwner1() {
        return owner1;
    }

    public void setOwner1(String owner1) {
        this.owner1 = owner1;
    }

    public String getOwner2() {
        return owner2;
    }

    public void setOwner2(String owner2) {
        this.owner2 = owner2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void overdraft(double amount) {
        account.overdraft(amount);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Δεν επαρκεί το υπόλοιπο του λογαριασμού");
        } else {
            balance -= amount;
        }
    }

    public void transfer(double amount, JointAccount account) {
        if (amount > balance) {
            System.out.println("Δεν επαρκεί το υπόλοιπο του λογαριασμού");
        } else {
            balance -= amount;
            account.deposit(amount);
        }
    }





}
