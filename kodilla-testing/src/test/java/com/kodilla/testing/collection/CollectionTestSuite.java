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

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //Given
        List<Integer> emptyLists = new ArrayList<>();

        //When
        List<Integer> result = exterminator.exterminate(emptyLists);
        if(result.isEmpty()) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Test was aborted");
        }

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

            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(2);
            expected.add(4);
            expected.add(6);


            // When
            List<Integer> output = exterminator.exterminate(input);
            System.out.println("Testing " + expected);

            // Then
            Assertions.assertEquals(expected, output);
        }
    }

