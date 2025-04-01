package gr.aueb.cf.ch13_publicAPI.challenges.ex2.bankapp;

import gr.aueb.cf.ch13_publicAPI.challenges.ex2.bankapp.model.JointAccount;
import gr.aueb.cf.ch13_publicAPI.challenges.ex2.bankapp.model.OverdraftAccount;


/**
 * OverdraftAccount και JointAccount implementation
 * Public API for the bank application
 */
public class Main {

    public static void main(String[] args) {
        OverdraftAccount account = new OverdraftAccount(1000, 500);
        JointAccount jointAccount = new JointAccount("Γιάννης", "Μαρία");

        account.overdraft(1500);
        System.out.println(account.getBalance());

        jointAccount.deposit(1000);
        jointAccount.withdraw(500);
        System.out.println(jointAccount.getBalance());

        jointAccount.transfer(200, jointAccount);
        System.out.println(jointAccount.getBalance());

        jointAccount.transfer(1000, jointAccount);
        System.out.println(jointAccount.getBalance());

        jointAccount.overdraft(1500);
        System.out.println(jointAccount.getBalance());


    }
}
