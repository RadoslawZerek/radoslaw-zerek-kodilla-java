package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
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

        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);

        // When
        for (Integer expectedNumbersList : exterminator.exterminate(input)) {
            System.out.println(expectedNumbersList);
        }
        // Then
        Assertions.assertTrue(input.size() != 0);
        for (Integer evenNumberList : exterminator.exterminate(input)) {
            Assertions.assertTrue(evenNumberList % 2 == 0);
        }
        for (Integer evenNumberList : exterminator.exterminate(input)) {
            Assertions.assertFalse(evenNumberList % 2 != 0);
        }
    }
}

