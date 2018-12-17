package com.itxxx.service;

import com.itxxx.domain.Account;

import java.util.List;

public interface AccountService {
    Account findById(Integer id);
    void saveAccount(Account account);
    void deleteAccountById(Integer id);
    void updateAccount(Account account);
    List<Account> findAll();
}
