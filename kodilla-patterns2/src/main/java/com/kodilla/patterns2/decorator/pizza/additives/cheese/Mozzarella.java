package com.kodilla.patterns2.decorator.pizza.additives.cheese;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Mozzarella extends AbstractPizzaOrder {
    public Mozzarella(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " mozarella";
    }
}
