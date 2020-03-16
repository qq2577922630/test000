package com.baidu.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer accountId;
    private String accountName;
    private Float accountMoney;

    public Account() {
    }

    public Account(Integer accountId, String accountName, Float accountMoney) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Float getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Float accountMoney) {
        this.accountMoney = accountMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountMoney=" + accountMoney +
                '}';
    }
}
