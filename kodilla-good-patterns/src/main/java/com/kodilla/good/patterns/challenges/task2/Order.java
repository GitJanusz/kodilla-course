package com.kodilla.good.patterns.challenges.task2;

import java.time.LocalDateTime;

public class Order {

    private int orderNumber;
    private LocalDateTime date;

    public Order(int orderNumber, LocalDateTime date) {
        this.orderNumber = orderNumber;
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
