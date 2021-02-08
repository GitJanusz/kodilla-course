package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BigmacTestSuite {
    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("z sezamem")
                .Burgers(2)
                .Sauce("1000 wysp")
                .Ingredient("sałata")
                .Ingredient("cebula")
                .Ingredient("bekon")
                .build();
        System.out.println(bigmac);
        //When
        String bun = bigmac.getBun();
        String roll = bigmac.getRoll();
        //Then
        assertEquals("z sezamem", bun);
        assertNull(roll);
    }
}
