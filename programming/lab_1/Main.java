import java.util.Arrays;

public class Main {
    public static void main() {
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
                if (d[i] == 8) {
                    b[i][j] = Math.atan(Math.cos(x[j])) / 2;
                } else if (d[i] == 6 || d[i] == 10 || d[i] == 14 || d[i] == 16) {
                    double digit = Math.pow(0.25 / Math.pow(x[j] / 3, 2), Math.pow(x[j], 2));
                    double power = (Math.sin(Math.pow(x[j] / (2 / 3), 3)) - 1) / 4;
                    b[i][j] = Math.pow(digit, power);
                } else {
                    b[i][j] = 0.5 * Math.asin(Math.cos(Math.pow(Math.cos(x[j]), 2)));
                }
            }
        }

        // Вывод массива b
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.3f\t", b[i][j]);
            }
            System.out.println();
        }
    }

}
