package com.pduda.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> productPrices;

    public ShoppingCart() {
        this.productPrices = new ArrayList<>();
    }

    public void add(int price) {
        this.productPrices.add(price);
    }

    public int calculateTotalPrice() {
        return this.productPrices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return this.productPrices.stream().anyMatch(price -> price >= 100);
    }

    public int numberOfProducts() {
        return this.productPrices.size();
    }
}
