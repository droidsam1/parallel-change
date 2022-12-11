package com.pduda.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> productPrices;
    private int price;

    public ShoppingCart() {
        productPrices = new ArrayList<>();
    }

    public void add(int price) {
        this.price += price;
        this.productPrices.add(price);
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return this.productPrices.stream().anyMatch(price -> price >= 100);
    }

    public int numberOfProducts() {
        return this.productPrices.size();
    }
}
