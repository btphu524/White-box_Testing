package org.example;

import org.junit.Test;

import static org.example.UCLN.gcd;
import static org.junit.Assert.*;

public class TestUCLN {
    @Test
    public void testZeroInput() {
        assertEquals(5, gcd(0, 5));
        assertEquals(3, gcd(3, 0));
        assertEquals(0, gcd(0, 0));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(7, gcd(7, 7));
    }

    @Test
    public void testFirstGreater() {
        assertEquals(6, gcd(18, 12));
    }

    @Test
    public void testSecondGreater() {
        assertEquals(6, gcd(12, 18));
    }

    @Test
    public void testPrimeNumbers() {
        assertEquals(1, gcd(13, 17));
    }
}
