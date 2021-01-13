package com.kodilla.testing.calculator;

public class Calculator {

    int numA;
    int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }
    public int getAddNums() {
        return numA + numB;
    }
    public int getSubtractNums() {
        return numA - numB;
    }
}
