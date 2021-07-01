package com.kodilla.patterns2.decorator.pizza.additives.meat;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Chicken extends AbstractPizzaOrder {
    public Chicken(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", kurczak";
    }
}
