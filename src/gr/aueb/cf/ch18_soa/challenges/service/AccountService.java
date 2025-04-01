package gr.aueb.cf.ch18_soa.challenges.service;

import gr.aueb.cf.ch18_soa.challenges.dao.AccountDAO;
import gr.aueb.cf.ch18_soa.challenges.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch18_soa.challenges.exceptions.NegativeAmountException;
import gr.aueb.cf.ch18_soa.challenges.exceptions.SsnNotValidException;
import gr.aueb.cf.ch18_soa.challenges.model.Account;

public class AccountService {
    private final AccountDAO accountDAO;

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void createAccount(Account account) {
        accountDAO.save(account);
    }

    public Account getAccountById(int id) {
        return accountDAO.findById(id);
    }

    /**
     * Deposits a certain amount of money to the given account ID.
     *
     * @param accountId The account ID.
     * @param amount    The amount to be deposited.
     * @throws NegativeAmountException If the amount is negative.
     */
    public void deposit(int accountId, double amount) throws NegativeAmountException, IllegalArgumentException {
        Account account = accountDAO.findById(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account not found for ID: " + accountId);
        }

        account.deposit(amount);
        accountDAO.update(account);  // Ενημερώνουμε το DAO
        System.out.println("Amount " + amount + " successfully deposited to account " + accountId);
    }

    /**
     * Withdraws an amount of money from an account based on a valid SSN.
     *
     * @param accountId The account ID.
     * @param amount    The amount to be withdrawn.
     * @param ssn       The SSN to verify.
     * @throws SsnNotValidException          If the SSN is incorrect.
     * @throws InsufficientBalanceException If there are not enough funds.
     * @throws NegativeAmountException       If the amount is negative.
     */
    public void withdraw(int accountId, double amount, String ssn)
            throws SsnNotValidException, InsufficientBalanceException, NegativeAmountException {
        Account account = accountDAO.findById(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account not found for ID: " + accountId);
        }

        account.withdraw(amount, ssn);
        accountDAO.update(account);  // Ενημερώνουμε το DAO
        System.out.println("Amount " + amount + " successfully withdrawn from account " + accountId);
    }

    /**
     * Gets the balance of the account with the given ID.
     *
     * @param accountId The account ID.
     * @return The balance of the account.
     */
    public double getAccountBalance(int accountId) {
        Account account = accountDAO.findById(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Account not found for ID: " + accountId);
        }
        return account.getBalance();
    }
}
