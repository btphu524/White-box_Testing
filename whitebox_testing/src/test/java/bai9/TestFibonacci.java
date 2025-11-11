package bai9;

import org.junit.jupiter.api.Test;

import static bai9.Fibonacci.fibonacciArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {
    @Test
    public void testNegative() {
        assertEquals(-1, fibonacciArray(-5));
    }

    @Test
    public void testZero() {
        assertEquals(0, fibonacciArray(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, fibonacciArray(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, fibonacciArray(2));
    }

    @Test
    public void testLarger() {
        assertEquals(5, fibonacciArray(5));
        assertEquals(13, fibonacciArray(7));
        assertEquals(55, fibonacciArray(10));
    }
}
