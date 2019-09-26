package com.jj.spb.spring_boot_mybatis.resultEntity;

public class Result {

    boolean isSuccess;
    String content;
    int errorCord;
    String errorMessage;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getErrorCord() {
        return errorCord;
    }

    public void setErrorCord(int errorCord) {
        this.errorCord = errorCord;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
