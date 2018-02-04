package com.alex.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * Description:
 * User: Alexander Luo(496952252@qq.com)
 * Date: 2018-02-03
 * Time: 17:49
 */


public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private String userId;
    private String account;
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


}
