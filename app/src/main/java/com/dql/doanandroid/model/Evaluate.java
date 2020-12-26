package com.dql.doanandroid.model;

public class Evaluate {
    public Evaluate(int shopId, int evaRate, String usrUsr, String evaContent, String evaTitle, String evaTime, String evaImgs) {
        evaId = 0;
        this.shopId = shopId;
        this.evaRate = evaRate;
        this.usrUsr = usrUsr;
        this.evaContent = evaContent;
        this.evaTitle = evaTitle;
        this.evaTime = evaTime;
        this.evaImgs = evaImgs;
    }

    private int shopId;
    private int evaRate;

    public int getEvaId() {
        return evaId;
    }

    public void setEvaId(int evaId) {
        this.evaId = evaId;
    }

    private int evaId;
    private String usrUsr, evaContent, evaTitle, evaTime, evaImgs;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getEvaRate() {
        return evaRate;
    }

    public void setEvaRate(int evaRate) {
        this.evaRate = evaRate;
    }

    public String getUsrUsr() {
        return usrUsr;
    }

    public void setUsrUsr(String usrUsr) {
        this.usrUsr = usrUsr;
    }

    public String getEvaContent() {
        return evaContent;
    }

    public void setEvaContent(String evaContent) {
        this.evaContent = evaContent;
    }

    public String getEvaTitle() {
        return evaTitle;
    }

    public void setEvaTitle(String evaTitle) {
        this.evaTitle = evaTitle;
    }

    public String getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(String evaTime) {
        this.evaTime = evaTime;
    }

    public String getEvaImgs() {
        return evaImgs;
    }

    public void setEvaImgs(String evaImgs) {
        this.evaImgs = evaImgs;
    }
}
/*
        content.put("shopId", i.getShopId());
        content.put("evaRate", i.getEvaRate());
        content.put("usrUsr", i.getEsrUsr());
        content.put("evaContent", i.getEvaContent());
        content.put("evaTitle", i.getEvaTitle());
        content.put("evaTime", i.getEvaTime());
        content.put("evaImgs", i.getEvaImgs());
 */