package org.example;

import org.junit.Test;

import static org.example.Prime.isPrime;
import static org.junit.Assert.*;

public class TestPrime {
    @Test
    public void testNegativeAndSmall() {
        assertFalse(isPrime(-5));
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
    }

    @Test
    public void testSmallPrimes() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
    }

    @Test
    public void testCompositeNumbers() {
        assertFalse(isPrime(4));
        assertFalse(isPrime(9));
        assertFalse(isPrime(15));
    }

    @Test
    public void testLargePrimes() {
        assertTrue(isPrime(17));
        assertTrue(isPrime(23));
        assertTrue(isPrime(97));
    }
}
