package com.kodilla.stream.array;

import java.math.BigDecimal;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0,numbers.length).map(n -> numbers[n])
                .forEach(System.out::println);
        return (double) Math.round((IntStream.range(0,numbers.length)
                .map(n -> numbers[n]).average().getAsDouble())*100)/100;
    }
}
