package bai2;

import org.junit.jupiter.api.Test;

import static bai2.LinearSearch.linearSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLinearSearch {

    @Test
    public void testFoundFirstElement() {
        int[] arr = {5, 10, 15};
        assertEquals(0, linearSearch(arr, 5, arr.length)); // phần tử đầu tiên
    }

    @Test
    public void testFoundMiddleElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, linearSearch(arr, 3, arr.length)); // phần tử giữa
    }

    @Test
    public void testFoundLastElement() {
        int[] arr = {7, 8, 9};
        assertEquals(2, linearSearch(arr, 9, arr.length)); // phần tử cuối
    }

    @Test
    public void testNotFound() {
        int[] arr = {1, 3, 5, 7};
        assertEquals(-1, linearSearch(arr, 2, arr.length)); // không tìm thấy
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, linearSearch(arr, 10, arr.length)); // mảng rỗng
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-5, -3, 0, 2, 4};
        assertEquals(1, linearSearch(arr, -3, arr.length)); // số âm
    }
}
