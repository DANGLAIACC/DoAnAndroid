package com.dql.doanandroid.model;

public class Dish {
    public int getDishId() {
        return dishId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getDishTypeId() {
        return dishTypeId;
    }

    public void setDishTypeId(int dishTypeId) {
        this.dishTypeId = dishTypeId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishImg() {
        return dishImg;
    }

    public void setDishImg(String dishImg) {
        this.dishImg = dishImg;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }

    public String getDishArticle() {
        return dishArticle;
    }

    public void setDishArticle(String dishArticle) {
        this.dishArticle = dishArticle;
    }

    private int dishId, shopId, dishTypeId, dishPrice;
    private String dishName, dishImg, dishArticle;

    public Dish(int shopId, int dishTypeId, String dishName, String dishImg, int dishPrice, String dishArticle) { 
        this.shopId = shopId;
        this.dishTypeId = dishTypeId;
        this.dishName = dishName;
        this.dishImg = dishImg;
        this.dishPrice = dishPrice;
        this.dishArticle = dishArticle;
    }
}
/**

 private static final String DISHID = "dishId";
 private static final String SHOPID = "shopId";
 private static final String DISHTYPEID = "dishTypeId";
 private static final String DISHNAME = "dishName";
 private static final String DISHIMG = "dishImg";
 private static final String DISHPRICE = "dishPrice";
 private static final String DISHARTICLE = "dishArticle";


 */
