package com.kodilla.patterns2.decorator.pizza.additives.drink;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Pepsi extends AbstractPizzaOrder {
    public Pepsi(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", 1L Pepsi";
    }
}
