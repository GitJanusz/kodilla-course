package com.kodilla.stream.array;

import org.junit.Test;

import java.util.OptionalDouble;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] number = new int[20];
        number[0] = 6;
        number[1] = 5;
        number[2] = 4;
        number[3] = 7;
        number[4] = 9;
        number[5] = 2;
        number[6] = 3;
        number[7] = 12;
        number[8] = 1;
        number[9] = 6;
        number[10] = 13;
        number[11] = 7;
        number[12] = 8;
        number[13] = 3;
        number[14] = 4;
        number[15] = 6;
        number[16] = 2;
        number[17] = 9;
        number[18] = 1;
        number[19] = 3;

        //When
        double arrayAverage = ArrayOperations.getAverage(number);

        //Then
        assertEquals(5.55, arrayAverage, 0);
    }
}
