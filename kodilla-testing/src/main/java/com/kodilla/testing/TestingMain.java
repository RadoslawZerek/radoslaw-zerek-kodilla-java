package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator simpleCalculator = new Calculator(74574, 82417);

        int additionResult = simpleCalculator.getAddNums();
        int subtractionResult = simpleCalculator.getSubtractNums();

        //Addition test
        if(additionResult != 0) {
            System.out.println("Test OK");
            System.out.println("The result of the addition: " + simpleCalculator.getAddNums());
        } else {
            System.out.println("Error!");
        }
        //Subtraction test
        if(subtractionResult != 0) {
            System.out.println("Test Ok");
            System.out.println("The result of the subtraction: " + simpleCalculator.getSubtractNums());
        } else {
            System.out.println("Error!");
        }
    }
}
