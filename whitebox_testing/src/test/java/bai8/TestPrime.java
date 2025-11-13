package bai8;

import org.junit.jupiter.api.Test;

import static bai8.Prime.isPrime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPrime {
    @Test
    public void testSmall() {
        assertFalse(isPrime(1)); // L0
    }

    @Test
    public void testSmallPrimes() {
        assertTrue(isPrime(2)); // L0
        assertTrue(isPrime(5)); // L1
    }

    @Test
    public void testCompositeNumbers() {
        assertFalse(isPrime(4)); // L1
        assertFalse(isPrime(9)); // L2
    }

    @Test
    public void testLargePrimes() {
        assertTrue(isPrime(17)); // L3
    }
}
