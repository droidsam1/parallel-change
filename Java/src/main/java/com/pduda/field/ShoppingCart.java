package com.pduda.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> productPrices;

    public ShoppingCart() {
        productPrices = new ArrayList<>();
    }

    public void add(int price) {
        this.productPrices.add(price);
    }

    public int calculateTotalPrice() {
        return productPrices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return productPrices.stream().anyMatch(price -> price >= 100);
    }

    public int numberOfProducts() {
        return productPrices.size();
    }
}
