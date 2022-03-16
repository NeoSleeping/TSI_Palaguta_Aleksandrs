package lv.tsi.practice1.exercise2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialCalculatorTest {
    @Test
    void testFactorial() {
        assertEquals(3628800, (new FactorialCalculator()).factorial(10));
    }

    @Test
    void testFactorialRecursion() {
        assertEquals(3628800, (new FactorialCalculator()).factorialRecursion(10));
    }
}

