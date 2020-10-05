package com.baidu.exception;

public class WuXiaoException extends RuntimeException {

    private String str;
    String v1="1";
    public WuXiaoException(String str){

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
