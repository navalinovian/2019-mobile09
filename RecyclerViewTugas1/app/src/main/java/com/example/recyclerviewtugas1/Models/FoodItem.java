package com.example.recyclerviewtugas1.Models;

public class FoodItem {
    public String foodName;
    public int imageUrl;

    public FoodItem(String foodName, int imageUrl) {
        this.foodName = foodName;
        this.imageUrl = imageUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
