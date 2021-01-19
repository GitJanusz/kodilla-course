package com.kodilla.good.patterns.challenges.task3;

public class Product {

    private String type;
    private int amount;

    public Product(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "|Produkt: " + type +
                ", ilość: " + amount;
    }
}
