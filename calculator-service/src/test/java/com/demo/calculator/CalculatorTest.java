
package com.demo.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddNumbers() {
        assertEquals(10, calculator.add(4, 6));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(24, calculator.multiply(4, 6));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }

    @Test
    void shouldIdentifyEvenNumbers() {
        assertTrue(calculator.isEven(8));
        assertFalse(calculator.isEven(7));
    }
}
