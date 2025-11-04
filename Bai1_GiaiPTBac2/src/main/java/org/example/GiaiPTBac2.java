package org.example;

public class GiaiPTBac2 {
    public static String solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return c == 0 ? "Vô số nghiệm" : "Vô nghiệm";
            } else {
                double x = -c / b;
                return "Một nghiệm: x = " + x;
            }
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return "Vô nghiệm";
            } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Một nghiệm kép: x = " + x;
        } else {
             double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            return "Hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
