package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] numbers = new int[] {2, 15, 3, 5, 57, 13, 7, 6, 37, 99,
                                    87, 9, 20, 11, 1, 7, 73, 31, 19, 178};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(34.0, result, 0);
    }
}
