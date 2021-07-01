package com.kodilla.patterns2.decorator.pizza.additives.dough;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Thin extends AbstractPizzaOrder {
    public Thin(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", na cienkim cieście";
    }
}
