package com.itxxx.dao;

import com.itxxx.domain.Account;

import java.util.List;

public interface AccountDao {
    Account findById(Integer id);
    void saveAccount(Account account);
    void deleteAccountById(Integer id);
    void updateAccount(Account account);
    List<Account> findAll();
}
