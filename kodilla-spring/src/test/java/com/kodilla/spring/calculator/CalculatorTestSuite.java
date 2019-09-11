package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double d1 = 4.34;
        double d2 = 2.67;
        double expectedSumResult = 7.01;
        double expectedSubResult = 1.67;
        double expectedMulResult = 11.5878;
        double expectedDivResult = 1.625468164794007;
        double delta = 0.001;

        // When
        double sumResult = calculator.add(d1, d2);
        double subResult = calculator.sub(d1, d2);
        double mulResult = calculator.mul(d1, d2);
        double divResult = calculator.div(d1, d2);

        // Then
        assertEquals(expectedSumResult, sumResult, delta);
        assertEquals(expectedSubResult, subResult, delta);
        assertEquals(expectedMulResult, mulResult, delta);
        assertEquals(expectedDivResult, divResult, delta);
    }
}