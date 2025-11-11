package bai5;

import org.junit.jupiter.api.Test;

import static bai5.CalDay.cal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalDay {
    @Test
    public void testSameMonth() {
    // Cùng tháng
        assertEquals(5, cal(3, 10, 3, 15, 2024));
    }

    @Test
    public void testDifferentMonthNonLeapYear() {
    // Khác tháng, năm không nhuận
        assertEquals(28, cal(2, 1, 2, 29, 2023)); // Feb không có 29
        assertEquals(28, cal(2, 1, 3, 1, 2023));
    }

    @Test
    public void testDifferentMonthLeapYear() {
    // Khác tháng, năm nhuận
        assertEquals(29, cal(2, 1, 3, 1, 2024));
    }

    @Test
    public void testMultipleMonths() {
        // Qua nhiều tháng
        assertEquals(60, cal(1, 1, 3, 1, 2024)); // Jan + Feb (leap) => 31 + 29 = 60
    }

    @Test
    public void testCentury() {
    // Năm chia hết 100 nhưng không chia hết 400
        assertEquals(28, cal(2, 1, 3, 1, 1900));
    // Năm chia hết 400
        assertEquals(29, cal(2, 1, 3, 1, 2000));
    }
}
