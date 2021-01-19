package com.kodilla.good.patterns.challenges.task3;

import java.util.List;

public class Supplier {

    private String name;
    private List<Product> productList;

    public Supplier(String name, List<Product> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
