package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //When
        calculator.add(1.1, 1.1);
        calculator.sub(2.2, 1.1);
        calculator.mul(1.2, 2.2);
        calculator.div(1.1, 1.1);
    }
}
