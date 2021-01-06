package org.launchcode.java.studios.areaofacircle;

public class PiRandonNumber {
    public static double getPI() {

        double inside = 0;
        double n = 1000;
        double pi;

        for (int i = 0; i <= n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(x * x + y * y) <= 1) {
                inside += 1;
            }

        }
        pi = 4 * inside / n;
        return pi;
    }
}

