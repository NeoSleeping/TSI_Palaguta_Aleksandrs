package lv.tsi.practice1.exercise3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class OneDimensionalArrayTest {
    @Test
    void testCreateRandomArray() {
        assertEquals(3, (new OneDimensionalArray()).createRandomArray(3).length);
        assertThrows(NegativeArraySizeException.class, () -> (new OneDimensionalArray()).createRandomArray(-1));
    }

    @Test
    void testAverage() {
        assertEquals(10.0, (new OneDimensionalArray()).average(new double[]{10.0, 10.0, 10.0, 10.0}));
    }
}

