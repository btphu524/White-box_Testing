package bai1;

import org.junit.jupiter.api.Test;

import static bai1.GiaiPTBac2.solve;
import static org.junit.jupiter.api.Assertions.*;

public class TestGiaiPTBac2 {

    @Test
    public void testVoSoNghiem() {
        // a = 0, b = 0, c = 0
        assertEquals("Vô số nghiệm", solve(0, 0, 0));
    }

    @Test
    public void testVoNghiemBacNhat() {
        // a = 0, b = 0, c != 0
        assertEquals("Vô nghiệm", solve(0, 0, 5));
    }

    @Test
    public void testMotNghiemBacNhat() {
        // a = 0, b != 0
        assertEquals("Một nghiệm: x = -2.0", solve(0, 2, 4));
    }

    @Test
    public void testVoNghiemBacHai() {
        // delta < 0
        assertEquals("Vô nghiệm", solve(1, 1, 1));
    }

    @Test
    public void testNghiemKep() {
        // delta = 0
        assertEquals("Một nghiệm kép: x = -1.0", solve(1, 2, 1));
    }

    @Test
    public void testHaiNghiemPhanBiet() {
        // delta > 0
        String result = solve(1, -3, 2);
        // Kết quả mong đợi: x1 = 2.0, x2 = 1.0
        assertTrue(result.contains("Hai nghiệm phân biệt"));
        assertTrue(result.contains("x1 = 2.0"));
        assertTrue(result.contains("x2 = 1.0"));
    }
}
