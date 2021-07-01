package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.additives.cheese.BlueCheese;
import com.kodilla.patterns2.decorator.pizza.additives.cheese.Double;
import com.kodilla.patterns2.decorator.pizza.additives.cheese.GranaPadano;
import com.kodilla.patterns2.decorator.pizza.additives.cheese.Mozzarella;
import com.kodilla.patterns2.decorator.pizza.additives.dough.Thick;
import com.kodilla.patterns2.decorator.pizza.additives.dough.Thin;
import com.kodilla.patterns2.decorator.pizza.additives.drink.Fanta;
import com.kodilla.patterns2.decorator.pizza.additives.drink.Lipton;
import com.kodilla.patterns2.decorator.pizza.additives.drink.Pepsi;
import com.kodilla.patterns2.decorator.pizza.additives.meat.Bacon;
import com.kodilla.patterns2.decorator.pizza.additives.meat.Chicken;
import com.kodilla.patterns2.decorator.pizza.additives.meat.ParmaHam;
import com.kodilla.patterns2.decorator.pizza.additives.vegetable.Maize;
import com.kodilla.patterns2.decorator.pizza.additives.vegetable.Mushrooms;
import com.kodilla.patterns2.decorator.pizza.additives.vegetable.Onion;
import com.kodilla.patterns2.decorator.pizza.order.BasicPizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.PizzaOrder;
import com.kodilla.patterns2.decorator.pizza.order.pizzerias.DaGrassoNetworkOrder;
import com.kodilla.patterns2.decorator.pizza.order.pizzerias.DominosPizzaNetworkOrder;
import com.kodilla.patterns2.decorator.pizza.order.pizzerias.PizzaDominionNetworkOrder;
import com.kodilla.patterns2.decorator.pizza.order.pizzerias.PizzaHutNetworkOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testMeatPizzaFromDaGrassoGetDescriptionAndGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Mozzarella(pizzaOrder);
        pizzaOrder = new Thick(pizzaOrder);
        pizzaOrder = new Bacon(pizzaOrder);
        pizzaOrder = new Chicken(pizzaOrder);
        pizzaOrder = new ParmaHam(pizzaOrder);
        pizzaOrder = new DaGrassoNetworkOrder(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals("Pizza z sosem pomidorowym, ser mozarella, na grubym cieście, bekon, kurczak, szynka parmeńska. Zamówienie realizuje Da Grasso!", description);
        assertEquals(new BigDecimal(47), theCost);
        System.out.println("#1 Zamówienie: " + description + " Wartość zamówienia: " + theCost + "zł.");
    }

    @Test
    public void testVegetarianPizzaFromDominosPizzaGetDescriptionAndGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GranaPadano(pizzaOrder);
        pizzaOrder = new Maize(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Thin(pizzaOrder);
        pizzaOrder = new DominosPizzaNetworkOrder(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals("Pizza z sosem pomidorowym, ser grana padano, kukurydza, pieczarki, cebula, na cienkim cieście. Zamówienie realizuje Domino's Pizza!", description);
        assertEquals(new BigDecimal(40), theCost);
        System.out.println("#2 Zamówienie: " + description + " Wartość zamówienia: " + theCost + "zł.");
    }

    @Test
    public void testPizzaWithExtraCheeseFromPizzaDominionGetDescriptionAndGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new Mozzarella(pizzaOrder);
        pizzaOrder = new Double(pizzaOrder);
        pizzaOrder = new Thin(pizzaOrder);
        pizzaOrder = new Chicken(pizzaOrder);
        pizzaOrder = new Chicken(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new PizzaDominionNetworkOrder(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals("Pizza z sosem pomidorowym, ser mozarella, dodatkowy ser, na cienkim cieście, kurczak, kurczak, pieczarki. Zamówienie realizuje Pizza Dominium!", description);
        assertEquals(new BigDecimal(48), theCost);
        System.out.println("#3 Zamówienie: " + description + " Wartość zamówienia: " + theCost + "zł.");
    }

    @Test
    public void testPizzaWithDrinksFromPizzaHutGetDescriptionAndGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BlueCheese(pizzaOrder);
        pizzaOrder = new Thick(pizzaOrder);
        pizzaOrder = new Bacon(pizzaOrder);
        pizzaOrder = new Onion(pizzaOrder);
        pizzaOrder = new Fanta(pizzaOrder);
        pizzaOrder = new Lipton(pizzaOrder);
        pizzaOrder = new Pepsi(pizzaOrder);
        pizzaOrder = new PizzaHutNetworkOrder(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals("Pizza z sosem pomidorowym, ser pleśniowy, na grubym cieście, bekon, cebula, 1L Fanta, 1L Lipton, 1L Pepsi. Zamówienie realizuje Pizza Hut!", description);
        assertEquals(new BigDecimal(61), theCost);
        System.out.println("#4 Zamówienie: " + description + " Wartość zamówienia: " + theCost + "zł.");
    }
}
