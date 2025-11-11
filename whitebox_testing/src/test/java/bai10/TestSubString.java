package bai10;

import org.junit.jupiter.api.Test;

import static bai10.SubString.countSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubString {
    @Test
    public void testNullOrEmpty() {
        assertEquals(-1, countSubstring(null, "test"));
        assertEquals(-1, countSubstring("test", null));
        assertEquals(-1, countSubstring("test", ""));
    }

    @Test
    public void testSubstringLonger() {
        assertEquals(0, countSubstring("hi", "hello"));
    }

    @Test
    public void testNoMatch() {
        assertEquals(0, countSubstring("hello world", "xyz"));
    }

    @Test
    public void testSingleMatch() {
        assertEquals(1, countSubstring("hello world", "world"));
    }

    @Test
    public void testMultipleMatches() {
        assertEquals(3, countSubstring("abababa", "aba"));
    }

    @Test
    public void testOverlappingMatches() {
        assertEquals(3, countSubstring("aaaa", "aa"));
    }

    @Test
    public void testExactMatch() {
        assertEquals(1, countSubstring("test", "test"));
    }
}
