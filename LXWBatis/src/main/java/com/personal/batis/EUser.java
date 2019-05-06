package com.personal.batis;

/**
 * 2019/5/6/0006
 * Create by 刘仙伟
 */
public class EUser {
    private String cifSeq;
    private String userSeq;
    private String userId;

    public String getCifSeq() {
        return cifSeq;
    }

    public void setCifSeq(String cifSeq) {
        this.cifSeq = cifSeq;
    }

    public String getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(String userSeq) {
        this.userSeq = userSeq;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "EUser{" +
                "cifSeq='" + cifSeq + '\'' +
                ", userSeq='" + userSeq + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
