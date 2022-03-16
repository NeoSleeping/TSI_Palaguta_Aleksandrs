package lv.tsi.practice1.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GravityCalculatorTest {
    @Test
    void testCalculate() {
        assertEquals(0.0, (new GravityCalculator()).calculate());
    }
}

