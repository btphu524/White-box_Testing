package org.example;

import org.junit.Test;

import static org.example.SumArray.Sum;
import static org.junit.Assert.*;

public class TestSumArray {
    @Test
    public void testEmptyArray() {
        int[] a = {};
        assertEquals(-1, Sum(a, 0));
    }

    @Test
    public void testSingleElement() {
        int[] a = {5};
        assertEquals(5, Sum(a, 1));
    }

    @Test
    public void testMultipleElements() {
        int[] a = {1, 2, 3, 4, 5};
        assertEquals(15, Sum(a, 5));
    }

    @Test
    public void testNegativeNumbers() {
        int[] a = {-1, -2, 3};
        assertEquals(0, Sum(a, 3));
    }
}
