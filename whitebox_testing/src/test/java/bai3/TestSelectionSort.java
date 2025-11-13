package bai3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSelectionSort {
    @Test
    public void testSingleElement() {
        int[] arr = {1};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    public void testReverseOrder() {
        int[] arr = {2, 1};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2}, arr);
    }

    @Test
    public void testAlreadySorted() {
        int[] arr = {1, 2};
        SelectionSort.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2}, arr);
    }
}
