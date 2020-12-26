package com.dql.doanandroid.model;

public class User {
    private String usrUsr;
    private String usrPwd;
    private String usrName;
    private String usrAddress;
    private int usrGender;

    public User(String usrUsr, String usrPwd, String usrName, String usrAddress, int usrGender) {
        this.usrUsr = usrUsr;
        this.usrPwd = usrPwd;
        this.usrName = usrName;
        this.usrAddress = usrAddress;
        this.usrGender = usrGender;
    }
    public User(){}

    public String getUsrUsr() {
        return usrUsr;
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrAddress() {
        return usrAddress;
    }

    public void setUsrAddress(String usrAddress) {
        this.usrAddress = usrAddress;
    }

    public int getUsrGender() {
        return usrGender;
    }

    public void setUsrGender(int usrGender) {
        this.usrGender = usrGender;
    }
}
/*

    content.put("usrUsr",i.getUsrUsr());
    content.put("usrPwd",i.getUsrPwd());
    content.put("usrName",i.getUsrName());
    content.put("usrAddress",i.getUsrAddress());
    content.put("usrGender",i.getUsrGender());
* */