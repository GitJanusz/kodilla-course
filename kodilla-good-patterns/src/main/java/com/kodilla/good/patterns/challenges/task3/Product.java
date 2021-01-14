package com.kodilla.good.patterns.challenges.task3;

public class Product {

    private String type;
    private int amount;
    private double price;

    public Product(String type, int amount, double price) {
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}
