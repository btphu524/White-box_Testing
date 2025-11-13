package bai4;

import org.junit.jupiter.api.Test;

import static bai4.MergeSortedArray.cal;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestMergeSortedArray {
    @Test
    public void testNormalMerge1() {
        int[] a = {1};
        int[] b = {5};
        int[] c = new int[2];
        cal(a, 1, b, 1, c);
        assertArrayEquals(new int[]{1, 5}, c);
    }

    @Test
    public void testNormalMerge2() {
        int[] a = {5};
        int[] b = {2};
        int[] c = new int[2];
        cal(a, 1, b, 1, c);
        assertArrayEquals(new int[]{2, 5}, c);
    }

    @Test
    public void testSecondEmpty() {
        int[] a = {1, 5};
        int[] b = {};
        int[] c = new int[2];
        cal(a, 2, b, 0, c);
        assertArrayEquals(new int[]{1, 5}, c);
    }

    @Test
    public void testFirstEmpty() {
        int[] a = {};
        int[] b = {2, 7};
        int[] c = new int[2];
        cal(a, 0, b, 2, c);
        assertArrayEquals(new int[]{2, 7}, c);
    }

    @Test
    public void testBothEmpty() {
        int[] a = {};
        int[] b = {};
        int[] c = new int[0];
        cal(a, 0, b, 0, c);
        assertArrayEquals(new int[]{}, c);
    }

    @Test
    public void testNormalMerge3() {
        int[] a = {2, 5};
        int[] b = {6, 8, 9, 10};
        int[] c = new int[6];
        cal(a, 2, b, 4, c);
        assertArrayEquals(new int[]{2, 5, 6, 8, 9, 10}, c);
    }
}
