package com.kodilla.good.patterns.challenges.task3;

import java.util.ArrayList;
import java.util.List;

public class OrderData {

    public ExtraFoodShop order1() {
        String name = "Extra food shop";

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("kebab", 1));
        productList.add(new Product("zapiekanka", 3));

        return new ExtraFoodShop(name, productList);
    }

    public GlutenFreeShop order2() {
        String name = "Gluten free shop";

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("płatki bezglutenu", 4));
        productList.add(new Product("makaron bezglutenu", 2));

        return new GlutenFreeShop(name, productList);
    }

    public HealthyShop order3() {
        String name = "Healthy shop";

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("sałatka owocowa", 2));
        productList.add(new Product("sałatka jarzynowa", 4));

        return new HealthyShop(name, productList);
    }
}
