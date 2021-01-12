package com.kodilla.good.patterns.challenges.task2;

import java.time.format.DateTimeFormatter;

public class SaleService {

    public boolean sale(User user, Product product, Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = order.getDate().format(formatter);

        System.out.println("Klient(" + user.getName() + " " + user.getSurname() + ") " + "Zamówienie numer: "
                + order.getOrderNumber() + " z dnia: " + formatDateTime + " | Produkt: " + product.getName()
                + " ilość: " + product.getAmount() + " cena: " + product.getPrice() + "zł" + " został sprzedany!");

        return true;
    }
}
