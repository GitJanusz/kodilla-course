package com.kodilla.patterns2.decorator.pizza.order;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }

    @Override
    public String getDescription() {
        return "Pizza z sosem pomidorowym, ser";
    }
}
