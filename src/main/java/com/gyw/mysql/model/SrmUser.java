package com.gyw.mysql.model;

/**
 * Created by guoyouwei on 2018/1/31.
 */
public class SrmUser {

    private String bukrs;

    private String user_id;

    private String user_nm;

    private String passwd;

    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_nm() {
        return user_nm;
    }

    public void setUser_nm(String user_nm) {
        this.user_nm = user_nm;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "SrmUser{" +
                "bukrs='" + bukrs + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_nm='" + user_nm + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
