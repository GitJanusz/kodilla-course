package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(1.1, 1.1);
        double result2 = calculator.sub(2.2, 1.1);
        double result3 = calculator.mul(1.2, 2.2);
        double result4 = calculator.div(1.1, 1.1);
        //Then
        assertEquals(2.2, result1);
        assertEquals(1.1, result2);
        assertEquals(2.64, result3);
        assertEquals(1, result4);
    }
}
