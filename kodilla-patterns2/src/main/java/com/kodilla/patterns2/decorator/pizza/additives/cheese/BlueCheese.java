package com.kodilla.patterns2.decorator.pizza.additives.cheese;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class BlueCheese extends AbstractPizzaOrder {
    public BlueCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " pleśniowy";
    }
}
