package solutions;

import java.util.Random;

public class Rand10 {

    public static int rand10() {
        int rand = 0;
        for (int i = 0; i < 10; ++i) {
            rand += rand7();
        }
        return rand % 10 + 1;
    }

    public static int rand7() {
        return new Random().nextInt(6) + 1 ;
    }

    public static double[] toPercent(int[] arr, double total) {
        double[] percentage = new double[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            percentage[i] = (arr[i] / total) * 100;
        }
        return percentage;
    }

    public static void main(String[] args) {
        int[] reps = new int[10];
        int n = 100000;
        for (int i = 0; i < n; ++i) {
            int rand = rand10();
            ++reps[rand - 1];
        }
        double[] percentage = toPercent(reps,(double) n);
        for (int i = 0; i < percentage.length; ++i) {
            System.out.printf("%d: %.2f%%\n",i + 1, percentage[i]);
        }
    }
}
