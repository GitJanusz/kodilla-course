package com.kodilla.patterns2.decorator.pizza.additives.cheese;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class Double extends AbstractPizzaOrder {
    public Double(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", dodatkowy ser";
    }
}
