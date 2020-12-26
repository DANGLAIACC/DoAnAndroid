package com.dql.doanandroid.model;

public class ShopType {
    public int getShopTypeId() {
        return shopTypeId;
    }

    public String getShopTypeText() {
        return shopTypeText;
    }

    public void setShopTypeText(String shopTypeText) {
        this.shopTypeText = shopTypeText;
    }

    private int shopTypeId;
    private String shopTypeText;

    public ShopType(String shopTypeText) {
        shopTypeId = 0;
        this.shopTypeText = shopTypeText;
    }

}
