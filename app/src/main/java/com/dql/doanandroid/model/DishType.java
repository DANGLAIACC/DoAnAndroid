package com.dql.doanandroid.model;

public class DishType {
    public DishType(String dishTypeText) {
        dishTypeId = 0;
        this.dishTypeText = dishTypeText;
    }

    private int dishTypeId;
    private String dishTypeText;

    public int getDishTypeId() {
        return dishTypeId;
    }

    public String getDishTypeText() {
        return dishTypeText;
    }

    public void setDishTypeText(String dishTypeText) {
        this.dishTypeText = dishTypeText;
    }
}
