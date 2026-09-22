// package ru.itmo.prog.samples;

import java.util.Arrays;

public class Main {
    public static double Calculate(int d_i, float x_j) {
        if (d_i == 8) {
            return Math.atan(Math.cos(x_j)) / 2;
        } else if (d_i == 6 || d_i == 10 || d_i == 14 || d_i == 16) {
            double digit = Math.pow(0.25 / Math.pow(x_j / 3, 2), Math.pow(x_j, 2));
            double power = (Math.sin(Math.pow(x_j / (2 / 3), 3)) - 1) / 4;
            return Math.pow(digit, power);
        } else {
            return 0.5 * Math.asin(Math.cos(Math.pow(Math.cos(x_j), 2)));
        }
    }

    public static void printArray(double[][] matrix) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%10.3f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] d = new int[9];
        for (int i = 0; i < 9; i++) {
            d[i] = 6 + i * 2;
        }
        // Отладочный вывод массива d
        // System.out.println(Arrays.toString(d));

        float[] x = new float[12];
        float mn = -12.0f;
        float mx = 5.0f;
        for (int i = 0; i < 12; i++) {
            x[i] = (float) Math.random() * (mx - mn + 1) + mn;
        }
        // Отладочный вывод массива x
        // System.out.println(Arrays.toString(x));

        double[][] b = new double[9][12];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 12; j++) {
                b[i][j] = Calculate(d[i], x[j]);
            }
        }

        // Вывод массива b
        printArray(b);
    }

}
