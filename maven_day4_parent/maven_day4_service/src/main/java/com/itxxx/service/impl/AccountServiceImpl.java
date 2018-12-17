package com.itxxx.service.impl;

import com.itxxx.dao.AccountDao;
import com.itxxx.domain.Account;
import com.itxxx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public Account findById(Integer id) {
        Account account = accountDao.findById(id);
        return account;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void deleteAccountById(Integer id) {
        accountDao.deleteAccountById(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public List<Account> findAll() {
        List<Account> all = accountDao.findAll();
        return  all;
    }
}
