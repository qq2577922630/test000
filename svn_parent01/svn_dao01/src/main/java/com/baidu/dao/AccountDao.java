package com.baidu.dao;

import com.baidu.domain.Account;

import java.util.List;

public interface AccountDao {

    void saveAccount(Account account);

    List<Account> findAll();
}
