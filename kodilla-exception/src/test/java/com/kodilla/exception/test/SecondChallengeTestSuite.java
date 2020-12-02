package com.kodilla.exception.test;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void test() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(0, 0)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(-1, -3)),
                () -> assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(4.6, 2.3)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1.7))
        );
    }
}
