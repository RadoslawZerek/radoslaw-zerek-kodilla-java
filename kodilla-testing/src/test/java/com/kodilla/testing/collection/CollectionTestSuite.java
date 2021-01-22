package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When given an empty list, new empty list should be returned")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyLists = new ArrayList<>();

        //When
        List<Integer> result = exterminator.exterminate(emptyLists);

        //Then
        Assertions.assertEquals(emptyLists, result);
    }

    @DisplayName("When given a normal list, only even numbers should be returned")
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> input = Arrays.asList(2, 3, 5, 6, 7, 9);
        List<Integer> expectedList = Arrays.asList(2, 6);

        //When
        List<Integer> output = exterminator.exterminate(input);

        //Then
        Assertions.assertEquals(expectedList, output);
    }
}

