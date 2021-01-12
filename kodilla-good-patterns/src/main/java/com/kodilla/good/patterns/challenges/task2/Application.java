package com.kodilla.good.patterns.challenges.task2;

public class Application {

    public static void main(String[] args) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailConfirmation(), new OrderRepository(), new SaleService());
        productOrderService.process(purchaseRequest);
    }
}
