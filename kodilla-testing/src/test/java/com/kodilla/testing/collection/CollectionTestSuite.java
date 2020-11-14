package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Checking if list skipping odd numbers");
    }
    @AfterEach
    public void after() {
        System.out.println("Finish checking the list");
    }
    @DisplayName("when create empty list, " +
                 "then ArrayList should't return any values"
    )
    @Test
    public void testOddNumbersExterminationEmptyList() {
        //Given
        OddNumbersExterminator testOne = new OddNumbersExterminator();
        //When
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> normalList = new ArrayList<>();
        List<Integer> result = testOne.exterminate(emptyList);
        //Then
        Assertions.assertEquals(normalList, result);
    }
    @DisplayName("when create normal list with numbers, " +
                 "then ArrayList should return only even numbers"
    )
    @Test
    public void testOddNumbersExterminationNormalList() {
        //Given
        OddNumbersExterminator testTwo = new OddNumbersExterminator();
        //When
        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(2);
        oddNumbers.add(4);
        oddNumbers.add(6);

        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);

        List<Integer> result = testTwo.exterminate(normalList);
        //Then
        Assertions.assertEquals(oddNumbers, result);
    }
}