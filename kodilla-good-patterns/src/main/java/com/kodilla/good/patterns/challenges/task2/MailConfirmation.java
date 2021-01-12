package com.kodilla.good.patterns.challenges.task2;

import java.time.format.DateTimeFormatter;

public class MailConfirmation implements ConformationService {
    @Override
    public boolean sendConfirmation(User user, Product product, Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = order.getDate().format(formatter);

        System.out.println(user.getName() + ", Twoje zamówienie o numerze: " + order.getOrderNumber()
                + " utworzone dnia: " + formatDateTime + " przyjęto do realizacji!" + " Zamówiłeś: "
                + product.getName() + " o wartości: " + product.getPrice() + "zł");

        return true;
    }
}
