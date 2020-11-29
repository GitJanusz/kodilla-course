package com.kodilla.stream.world;


import org.junit.Test;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland", new BigDecimal("38500000"));
        Country france = new Country("France", new BigDecimal("66990000"));
        Country germany = new Country("Germany", new BigDecimal("83020000"));
        Country china = new Country("China", new BigDecimal("1393000000"));
        Country japan = new Country("Japan", new BigDecimal("126500000"));
        Country india = new Country("India", new BigDecimal("1353000000"));
        Country algeria = new Country("Algeria", new BigDecimal("42679000"));
        Country egypt = new Country("Egypt", new BigDecimal("104534123"));
        Country nigeria = new Country("Nigeria", new BigDecimal("200962000"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(germany);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);
        africa.addCountry(algeria);
        africa.addCountry(egypt);
        africa.addCountry(nigeria);

        //When
        BigDecimal totalWorldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedTotalWorldPeopleQuantity = new BigDecimal("3409185123");
        assertEquals(expectedTotalWorldPeopleQuantity, totalWorldPeopleQuantity);
    }
}
