package com.kodilla.patterns2.decorator.pizza.additives.meat;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class ParmaHam extends AbstractPizzaOrder {
    public ParmaHam(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", szynka parmeńska";
    }
}
