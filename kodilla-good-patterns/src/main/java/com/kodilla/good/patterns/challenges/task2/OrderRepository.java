package com.kodilla.good.patterns.challenges.task2;

import java.time.format.DateTimeFormatter;

public class OrderRepository {

    public boolean createOrder(User user, Product product, Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = order.getDate().format(formatter);

        System.out.println("Utworzono zamówienie nr: " + order.getOrderNumber() + " dla klienta: " + user.getName() + " "
                + user.getSurname() + " dnia: " + formatDateTime + " | Produkt: " + product.getName()
                + " ilość: " + product.getAmount() + " cena: " + product.getPrice() + "zł |" + " Zamówienie zostało utworzone!");

        return true;
    }
}
