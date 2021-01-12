package com.kodilla.good.patterns.challenges.task2;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {
        User user = new User("Andrzej", "Kowalski");
        Product product = new Product("toster", 123.45, 1);
        Order order = new Order(1234, LocalDateTime.of(2021, 1, 4, 12, 44));

        return new PurchaseRequest(user, product, order);
    }
}
