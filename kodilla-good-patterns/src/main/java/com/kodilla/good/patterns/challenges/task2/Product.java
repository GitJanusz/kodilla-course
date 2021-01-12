package com.kodilla.good.patterns.challenges.task2;

public class Product {

    private String name;
    private int amount;
    private double price;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
