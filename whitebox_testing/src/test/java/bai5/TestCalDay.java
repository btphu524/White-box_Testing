package bai5;

import org.junit.jupiter.api.Test;

import static bai5.CalDay.cal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalDay {
    @Test
    public void testSameMonth() {
    // Cùng tháng
        assertEquals(19, cal(1, 1, 1, 20, 2024));
    }

    @Test
    public void testDifferentMonthNonLeapYear() {
    // Khác tháng, năm không nhuận
        assertEquals(77, cal(1, 1, 3, 19, 2023));
        assertEquals(49, cal(1, 1, 2, 19, 2023)); // Feb không có 29
        assertEquals(108, cal(1, 1, 4, 19, 2023));
        assertEquals(138, cal(1, 1, 5, 19, 2023));
    }

    @Test
    public void testDifferentMonthLeapYear() {
    // Khác tháng, năm nhuận
        assertEquals(78, cal(1, 1, 3, 19, 2024));
    }

    @Test
    public void testMultipleMonths() {
        // Qua nhiều tháng
        assertEquals(60, cal(1, 1, 3, 1, 2024)); // Jan + Feb (leap) => 31 + 29 = 60
    }
}
