package com.gupaoedu.crud.bean;

import java.io.Serializable;

/**
 * 2019/4/29/0029
 * Create by 刘仙伟
 */
public class User implements Serializable {
    private String userSeq;
    private String userId;

    public String getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(String userSeq) {
        this.userSeq = userSeq;
    }

    @Override
    public String toString() {
        return "User{" +
                "userSeq='" + userSeq + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
