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
        this.price = price;
        this.productPrices.add(price);
    }

    public int calculateTotalPrice() {
        return productPrices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return productPrices.size();
    }
}
