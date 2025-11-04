package org.example;

import org.junit.Test;

import static org.example.MergeSortedArray.cal;
import static org.junit.Assert.*;

public class TestMergeSortedArray {
    @Test
    public void testBothEmpty() {
        int[] a = {};
        int[] b = {};
        int[] c = new int[0];
        cal(a, 0, b, 0, c);
        assertArrayEquals(new int[]{}, c);
    }
    @Test
    public void testFirstEmpty() {
        int[] a = {};
        int[] b = {2, 4, 6};
        int[] c = new int[3];
        cal(a, 0, b, 3, c);
        assertArrayEquals(new int[]{2, 4, 6}, c);
    }
    @Test
    public void testSecondEmpty() {
        int[] a = {1, 3, 5};
        int[] b = {};
        int[] c = new int[3];
        cal(a, 3, b, 0, c);
        assertArrayEquals(new int[]{1, 3, 5}, c);
    }
    @Test
    public void testNormalMerge1() {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] c = new int[6];
        cal(a, 3, b, 3, c);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, c);
    }
    @Test
    public void testNormalMerge2() {
        int[] a = {2, 4, 6};
        int[] b = {1, 3, 5};
        int[] c = new int[6];
        cal(a, 3, b, 3, c);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, c);
    }
}
