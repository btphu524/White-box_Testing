package bai7;

import org.junit.jupiter.api.Test;

import static bai7.UCLN.gcd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUCLN {
    @Test
    public void testZeroInput() {
        assertEquals(1, gcd(0, 1));
        assertEquals(1, gcd(1, 0));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(1, gcd(1, 1));
    }

    @Test
    public void testFirstGreater() {
        assertEquals(1, gcd(1, 2));
    }

    @Test
    public void testSecondGreater() {
        assertEquals(1, gcd(2, 1));
    }

    @Test
    public void testPrimeNumbers() {
        assertEquals(1, gcd(3, 1)); // L2
    }

    @Test
    public void testNonPrimeNumbers() {
        assertEquals(1, gcd(4, 1));
    } // L3 (k)

}
