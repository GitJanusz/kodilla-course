package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;

        int resultAdd = calculator.add(a, b);
        int resultSub = calculator.subtract(a, b);

        System.out.println("Pierwszy test: ");
        if (resultAdd == a + b) {
            System.out.println("Test OK");
        } else {
            System.out.println("ERROR!");
        }

        System.out.println("\nDrugi test: ");
        if (resultSub == a - b) {
            System.out.println("Test OK");
        } else {
            System.out.println("ERROR!");
        }
    }
}
