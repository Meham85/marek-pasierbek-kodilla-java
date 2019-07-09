package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1,2);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("test have ended");
        }
    }


}
