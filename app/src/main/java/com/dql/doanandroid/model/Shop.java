package com.dql.doanandroid.model;

public class Shop {

    public Shop(int shopTypeId, String shopName, String shopAddress, String shopArticle, String shopImg) {
        shopTypeId = 0;
        this.shopTypeId = shopTypeId;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopArticle = shopArticle;
        this.shopImg = shopImg;
    }
    // img tiền tố: https://images.foody.vn/res/
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

    public String getShopImg(){return shopImg;}
    public void setShopImg(String shopImg){this.shopImg = shopImg;}
    private int shopId, shopTypeId;
    private String shopName, shopAddress, shopArticle, shopImg;

}
/*
        content.put("shopTypeId",i.getShopTypeId);
        content.put("shopName",i.getShopName);
        content.put("shopAddress",i.getShopAddress);
        content.put("shopArticle",i.getShopArticle);
        content.put("shopImg",i.getShopImg);

 */
