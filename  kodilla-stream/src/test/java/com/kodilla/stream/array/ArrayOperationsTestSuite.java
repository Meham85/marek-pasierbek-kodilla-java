package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        //int[] numbers = new int[20];
        int[] numbers = IntStream.rangeClosed(1, 20).toArray();

        // When
        double averageResult = ArrayOperations.getAverage(numbers);
        double averageExpected = 10.5;

        // Then
        Assert.assertEquals(averageExpected, averageResult, 0.001);
    }
}
