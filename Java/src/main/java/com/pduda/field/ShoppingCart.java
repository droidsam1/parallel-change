package com.pduda.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> productPrices;
    private int price;
    private int numberOfProducts;
    private boolean hasDiscount;

    public ShoppingCart() {
        productPrices = new ArrayList<>();
    }

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
