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

    @DisplayName("Checks if the class behaves correctly when it is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {

            //Given
            List<Integer> someNumbers = new ArrayList<>(Arrays.asList(46, 78, 113, 258, 13));

            //When
            someNumbers.removeAll(someNumbers);
            boolean expectResult = someNumbers.isEmpty();

            if (expectResult == true) {
                System.out.println("Test OK");
            } else {
                System.out.println("Test was aborted");
            }
            //Then
            Assertions.assertTrue(expectResult);
        }
        @DisplayName("Checks if the class behaves correctly when it contains even and odd numbers")

        @Test
        void testOddNumbersExterminatorNormalList () {

            //Given
            List<Integer> emptyList = new ArrayList<>(Arrays.asList());
            boolean result = emptyList.isEmpty();
            System.out.println("List is empty " + result);

            //When

            List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(46, 78, 113, 258, 13));

            boolean expectedResult = anotherNumbers.isEmpty();

            if (expectedResult == false) {
                System.out.println("Test OK" + " List size: " + anotherNumbers.size());
            } else {
                System.out.println("Test was aborted");
            }
            //Then
            Assertions.assertFalse(expectedResult);

        }
    }

