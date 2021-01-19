package com.kodilla.good.patterns.challenges.task3;

import java.util.List;

public class GlutenFreeShop extends Supplier implements OrderingScheme {

    public GlutenFreeShop(String name, List<Product> productList) {
        super(name, productList);
    }

    @Override
    public boolean process(Supplier supplier) {
        System.out.println("Twoje zamówienie przygotuje dostawca: {" + supplier.getName()
                + "} " + supplier.getProductList() + " produkty zostaną dostarczone do 30 minut!");

        return true;
    }
}
