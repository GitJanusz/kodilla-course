package com.kodilla.good.patterns.challenges.task3;

import java.util.List;

public class HealthyShop extends Supplier implements OrderingScheme {

    public HealthyShop(String name, List<Product> productList) {
        super(name, productList);
    }

    @Override
    public boolean process(Supplier supplier) {
        System.out.println("Realizujący zamówienie: |" + supplier.getName()
                + "| " + supplier.getProductList() + " proszę odebrać zamówienie w sklepie!");

        return true;
    }
}
