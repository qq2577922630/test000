package com.baidu.service.impl;

import com.baidu.dao.AccountDao;
import com.baidu.domain.Account;
import com.baidu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void saveAccount(Account account)  {
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
