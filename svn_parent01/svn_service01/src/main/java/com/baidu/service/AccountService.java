package com.baidu.service;

import com.baidu.domain.Account;
import com.baidu.exception.WeiZhiException;

import java.util.List;

public interface AccountService {

    void saveAccount(Account account) throws WeiZhiException;

    List<Account> findAll();
}
