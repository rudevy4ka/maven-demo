package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, Calculator.calculate(2, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, Calculator.calculate(4, 3, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, Calculator.calculate(2, 3, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2, Calculator.calculate(6, 3, '/'));
    }

    @Test
    void testDivisionByZero() {
        assertTrue(Double.isNaN(Calculator.calculate(6, 0, '/')));
    }
}
