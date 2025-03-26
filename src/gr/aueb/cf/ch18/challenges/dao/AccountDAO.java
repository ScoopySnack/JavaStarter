package gr.aueb.cf.ch18.challenges.dao;

import gr.aueb.cf.ch18.challenges.model.Account;

import java.util.List;

public interface AccountDAO {
    void save(Account account);
    void update(Account account);
    void delete(Account account);
    Account findById(int id);
    Account findByIban(String iban);
    Account findByName(String firstname, String lastname);
    Account findBySsn(String ssn);
    List<Account> findAll();
}
