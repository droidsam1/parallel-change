package com.pduda.field;

public class ShoppingCart {
    private int price;

    private int numberOfProducts;

    private boolean hasDiscount;

    public void add(int price) {
        this.hasDiscount = price >= 100;
        this.price += price;
        this.numberOfProducts++;
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public int numberOfProducts() {
        return numberOfProducts;
    }
}
