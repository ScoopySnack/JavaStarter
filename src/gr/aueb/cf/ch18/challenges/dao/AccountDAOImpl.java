package gr.aueb.cf.ch18.challenges.dao;

import gr.aueb.cf.ch18.challenges.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO{
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public void save(Account account) {
        accounts.add(account);
    }

    @Override
    public void update(Account account) {
        delete(account.getId());  // delete the old account
        save(account);
    }

    @Override
    public void delete(Account account) {
        accounts.removeIf(acc -> acc.getId() == account.getId());
    }

    public void delete(int id) {
        accounts.removeIf(acc -> acc.getId() == id);
    }

    @Override
    public Account findById(int id) {
        return  accounts.stream()
                .filter(account -> account.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account findByName(String firstname, String lastname) {
        return accounts.stream()
                .filter(account -> account.getFirstname().equals(firstname) && account.getLastname().equals(lastname))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Account findBySsn(String ssn) {
        return accounts.stream()
                .filter(account -> account.getSsn().equals(ssn))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Account> findAll() {
        return new ArrayList<>(accounts);
    }
}
