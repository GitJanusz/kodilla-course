package com.kodilla.good.patterns.challenges.task3;

import java.util.List;

public class ExtraFoodShop extends Supplier implements OrderingScheme {

    public ExtraFoodShop(String name, List<Product> productList) {
        super(name, productList);
    }

    @Override
    public boolean process(Supplier supplier) {
        System.out.println("Zamówienie od dostwacy: [" + supplier.getName()
                + "] " + supplier.getProductList().toString() + " zostanie dzisiaj dostarczone!");

        return true;
    }
}
