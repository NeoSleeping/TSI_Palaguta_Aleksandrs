package lv.tsi.practice1.exercise5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TwoDimensionalArrayTest {
    @Test
    void testCreateRandomArray() {
        assertEquals(3, (new TwoDimensionalArray()).createRandomArray(3).length);
        assertThrows(NegativeArraySizeException.class, () -> (new TwoDimensionalArray()).createRandomArray(-1));
    }
}

