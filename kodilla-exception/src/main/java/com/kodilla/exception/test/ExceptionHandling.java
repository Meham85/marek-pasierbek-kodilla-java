package com.kodilla.exception.test;

public class ExceptionHandling {
SecondChallenge secondChallenge = new SecondChallenge();

    try { secondChallenge.probablyIWillThrowException(1,2)}
    catch (Exception e) {
        System.out.println("catch");
    } finally {
        System.out.println("test have done");
    }
}
