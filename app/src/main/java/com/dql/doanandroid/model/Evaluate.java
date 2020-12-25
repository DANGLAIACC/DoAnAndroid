package com.dql.doanandroid.model;

public class Evaluate {
    public Evaluate(int shopId, int evaRate, String usrUsr, String evaContent, String evaTitle, String evaTime, String evaImgs) {
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
        private static final String SHOPID = "shopId";
        private static final String EVARATE = "evaRate";
        private static final String USRUSR = "usrUsr";
        private static final String EVACONTENT = "evaContent";
        private static final String EVATITLE = "evaTitle";
        private static final String EVATIME = "evaTime";
        private static final String EVAIMGS = "evaImgs";

 */