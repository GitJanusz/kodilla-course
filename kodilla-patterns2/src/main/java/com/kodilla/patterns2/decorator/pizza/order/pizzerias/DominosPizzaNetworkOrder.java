package com.kodilla.patterns2.decorator.pizza.order.pizzerias;

import com.kodilla.patterns2.decorator.pizza.order.AbstractPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;

import java.math.BigDecimal;

public class DominosPizzaNetworkOrder extends AbstractPizzaOrder {
    public DominosPizzaNetworkOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(11));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ". Zamówienie realizuje Domino's Pizza!";
    }
}
