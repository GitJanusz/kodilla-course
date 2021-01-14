package com.kodilla.good.patterns.challenges.task3;

public class SupplierData {

    public Supplier ExtraFoodShop() {

        String name = "Extra Food Shop";
        Product product = new Product("Kebab", 2, 23.00);

        return new Supplier(name, product);
    }

    public Supplier HealthyShop() {

        String name = "Healthy Shop";
        Product product = new Product("Sałatka", 1, 12.43);

        return new Supplier(name, product);
    }

    public Supplier GlutenFreeShop() {

        String name = "Gluten Free Shop";
        Product product = new Product("Makaron bezglutenowy", 3, 24.99);

        return new Supplier(name, product);
    }
}
