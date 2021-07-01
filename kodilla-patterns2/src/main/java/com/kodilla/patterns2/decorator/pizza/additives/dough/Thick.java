package com.kodilla.patterns2.decorator.pizza.additives.dough;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Thick extends AbstractPizzaOrder {
    public Thick(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", na grubym cieście";
    }
}
