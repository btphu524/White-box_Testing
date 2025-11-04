package org.example;

public class CalDay {
    public static int cal(int m1, int d1, int m2, int d2, int y) {
        int numDays;

        if (m2 == m1) {
            numDays = d2 - d1;
        } else {
            int[] daysIn = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                daysIn[2] = 29;
            else
                daysIn[2] = 28;

            numDays = d2 + (daysIn[m1] - d1);

            for (int i = m1 + 1; i <= m2 - 1; i++) {
                numDays += daysIn[i];
            }
        }

        return numDays;
    }
}
