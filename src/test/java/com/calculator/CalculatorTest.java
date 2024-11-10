package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-1, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(-2.0, calculator.divide(-6, 3));
    }
}
