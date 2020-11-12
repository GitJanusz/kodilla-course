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
        OddNumbersExterminator createEmptyList = new OddNumbersExterminator();
        //When
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> result = createEmptyList.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, result);
    }
    @DisplayName("when create normal list with numbers, " +
                 "then ArrayList should return only even numbers"
    )
    @Test
    public void testOddNumbersExterminationNormalList() {
        //Given
        OddNumbersExterminator createNormalList = new OddNumbersExterminator();
        //When
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        List<Integer> result = createNormalList.exterminate(normalList);
        //Then
        Assertions.assertEquals(normalList, result);
    }
}