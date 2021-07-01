package com.kodilla.patterns2.decorator.pizza.order.pizzerias;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class PizzaHutNetworkOrder extends AbstractPizzaOrder {
    public PizzaHutNetworkOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(13));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ". Zamówienie realizuje Pizza Hut!";
    }
}
