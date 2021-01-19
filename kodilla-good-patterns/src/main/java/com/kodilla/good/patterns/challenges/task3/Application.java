package com.kodilla.good.patterns.challenges.task3;

public class Application {
    public static void main(String[] args) {

        OrderData orderData = new OrderData();
        ExtraFoodShop extraFoodShop = orderData.order1();
        extraFoodShop.process(extraFoodShop);

        GlutenFreeShop glutenFreeShop = orderData.order2();
        glutenFreeShop.process(glutenFreeShop);

        HealthyShop healthyShop = orderData.order3();
        healthyShop.process(healthyShop);
    }
}
