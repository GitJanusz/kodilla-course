package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2.8, 1.2);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Program finished");
        }
    }
}
