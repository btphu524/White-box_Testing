package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSelectionSort {

    @Test
    public void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testRandomOrder() {
        int[] arr = {3, 1, 4, 2, 5};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {0, -3, 5, -1, 2};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, arr);
    }

    @Test
    public void testAllEqualElements() {
        int[] arr = {7, 7, 7, 7, 7};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {10};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{10}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}
