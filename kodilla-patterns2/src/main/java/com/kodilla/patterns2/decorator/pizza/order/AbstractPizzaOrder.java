package com.kodilla.patterns2.decorator.pizza.order;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrder implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription();
    }
}
