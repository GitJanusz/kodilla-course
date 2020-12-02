package com.kodilla.exception.test;

import java.time.LocalTime;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException o) {
            System.out.println("You can't divide by zero " + o);
        } finally {
            System.out.println("Time of last attempt of divide: " + LocalTime.now());
        }
    }
}
