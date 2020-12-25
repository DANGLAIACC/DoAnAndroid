package com.dql.doanandroid.model;

public class DishType {
    public DishType(int dishTypeId, String dishTypeText) {
        this.dishTypeId = dishTypeId;
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
