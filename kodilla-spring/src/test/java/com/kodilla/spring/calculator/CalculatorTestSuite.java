package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double addResult = calculator.add(3, 5);
        double subResult = calculator.sub(14.5, 8.5);
        double mulResult = calculator.mul(8.2, 7.4);
        double divResult = calculator.div(25, 5);

        //Then
        assertEquals(8, addResult);
        assertEquals(6, subResult);
        assertEquals(60.68, mulResult);
        assertEquals(5, divResult);
    }
}