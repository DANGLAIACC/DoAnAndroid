package com.dql.doanandroid.model;

public class Dish {

    public Dish(int shopId, int dishTypeId, String dishName, String dishImg, int dishPrice, String dishArticle) {
        dishId = 0;
        this.shopId = shopId;
        this.dishTypeId = dishTypeId;
        this.dishName = dishName;
        this.dishImg = dishImg;
        this.dishPrice = dishPrice;
        this.dishArticle = dishArticle;
    }
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
}
/**


 content.put("shopId",getShopId());
 content.put("dishTypeId",getDishTypeId());
 content.put("dishName",getDishName());
 content.put("dishImg",getDishImg());
 content.put("dishPrice",getDishPrice());
 content.put("dishArticle",getDishArticle());


 */
