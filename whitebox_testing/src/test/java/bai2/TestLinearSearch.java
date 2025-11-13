package bai2;

import org.junit.jupiter.api.Test;

import static bai2.LinearSearch.linearSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLinearSearch {
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, linearSearch(arr, 1, arr.length)); // mảng rỗng
    }

    @Test
    public void testFoundFirstElement() {
        int[] arr = {1, 2, 3};
        assertEquals(0, linearSearch(arr, 1, arr.length)); // phần tử đầu tiên
    }

    @Test
    public void testFoundMiddleElement() {
        int[] arr = {1, 2, 3};
        assertEquals(1, linearSearch(arr, 2, arr.length)); // phần tử giữa
    }

    @Test
    public void testKLoop() {
        int[] arr = {2,5,1,4,6};
        assertEquals(3, linearSearch(arr, 4, arr.length)); // lặp k lần
    }

    @Test
    public void testFoundLastElement() {
        int[] arr = {1,2,5,8,6,3,7};
        assertEquals(6, linearSearch(arr, 7, arr.length)); // phần tử cuối
    }
}
