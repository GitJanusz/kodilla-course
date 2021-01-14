package com.kodilla.good.patterns.challenges.task3;

public class OrdersService implements OrderingScheme {

    private Supplier supplier;
    private int orderNumber;

    public OrdersService(Supplier supplier, int orderNumber) {
        this.supplier = supplier;
        this.orderNumber = orderNumber;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public boolean process(OrdersService ordersService) {
        System.out.println("Zrealizowano zamówienie numer: " + ordersService.getOrderNumber()
                + " od dostawcy: " + ordersService.getSupplier().getName()
                + " | Produkt: " + ordersService.getSupplier().getProduct().getType()
                + " w ilości " + ordersService.getSupplier().getProduct().getAmount()
                + ", kwota do zapłaty: " + ordersService.getSupplier().getProduct().getPrice()
                + ". Dziękujemy za zakup w naszym slepie!");

        return true;
    }
}
