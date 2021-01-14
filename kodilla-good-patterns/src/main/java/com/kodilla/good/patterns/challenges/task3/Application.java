package com.kodilla.good.patterns.challenges.task3;

public class Application {

    public static void main(String[] args) {

        SupplierData supplierData = new SupplierData();

        Supplier extraFoodShop = supplierData.ExtraFoodShop();
        OrdersService ordersService = new OrdersService(extraFoodShop, 1234);
        ordersService.process(ordersService);

        Supplier glutenFreeShop = supplierData.GlutenFreeShop();
        OrdersService ordersService1 = new OrdersService(glutenFreeShop, 1122);
        ordersService1.process(ordersService1);

        Supplier healthyShop = supplierData.HealthyShop();
        OrdersService ordersService2 = new OrdersService(healthyShop, 1321);
        ordersService2.process(ordersService2);
    }
}
