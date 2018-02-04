package com.alex.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author K神带你飞
 * @since 2018-02-04
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 第三
     */
    private String userId;
    /**
     * 用户账户名
     */
    private String account;
    /**
     * 用户姓名
     */
    private String userName;
    private String password;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId=" + userId +
        ", account=" + account +
        ", userName=" + userName +
        ", password=" + password +
        "}";
    }
}
