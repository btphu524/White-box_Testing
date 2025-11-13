package bai6;

import org.junit.jupiter.api.Test;

import static bai6.SumArray.Sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumArray {
    @Test
    public void testEmptyArray() {
        int[] a = {};
        assertEquals(-1, Sum(a, 0)); // L0
    }

    @Test
    public void testSingleElement() {
        int[] a = {1};
        assertEquals(1, Sum(a, 1)); // L1
    }

    @Test
    public void testMultipleElements1() {
        int[] a = {1, 2};
        assertEquals(3, Sum(a, 2)); // L2
    }

    @Test
    public void testMultipleElements2() {
        int[] a = {1, 2, 3, 4};
        assertEquals(10, Sum(a, 4)); // L4 (k)
    }
}
