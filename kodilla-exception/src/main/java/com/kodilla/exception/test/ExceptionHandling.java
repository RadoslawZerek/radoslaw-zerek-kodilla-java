package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        String result = null;

        try {
            result = challenge.probablyIWillThrowException(13, 1);
        } catch(Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("It's done!");
            if(result != null) {
                System.out.println(result);
            }
        }
    }
}
