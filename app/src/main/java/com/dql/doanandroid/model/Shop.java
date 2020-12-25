package com.dql.doanandroid.model;

public class Shop {
    public int getShopId() {
        return shopId;
    }
    public int getShopTypeId() {
        return shopTypeId;
    }

    public void setShopTypeId(int shopTypeId) {
        this.shopTypeId = shopTypeId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopArticle() {
        return shopArticle;
    }

    public void setShopArticle(String shopArticle) {
        this.shopArticle = shopArticle;
    }

    private int shopId, shopTypeId;
    private String shopName, shopAddress, shopArticle;

    public Shop(int shopId, int shopTypeId, String shopName, String shopAddress, String shopArticle) {
        this.shopId = shopId;
        this.shopTypeId = shopTypeId;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopArticle = shopArticle;
    }
}
/*
        private static final String SHOPID = "shopId";
        private static final String SHOPTYPEID = "shopTypeId";
        private static final String SHOPNAME = "shopName";
        private static final String SHOPADDRESS = "shopAddress";
        private static final String SHOPARTICLE = "shopArticle";

 */
