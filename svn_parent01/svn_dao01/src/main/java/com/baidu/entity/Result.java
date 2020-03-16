package com.baidu.entity;

public class Result {

    private boolean flage;
    private String message;



    public Result(boolean flage, String message) {
        this.flage = flage;
        this.message = message;
    }

    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
