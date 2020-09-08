/**
 * You are given an array of integers a.
 * Your task is to calculate how many numbers in the array are
 * equal to the arithmetic mean of their immediate neighbors.
 * In other words, count the number of indices i such that a[i - 1] + a[i + 1] = 2 * a[i].
 * Note: If a[i - 1] or a[i + 1] don't exist, they should be considered equal to 0.
 * Example
 * For a = [2, 4, 6, 6, 3], the output should be countArithmeticMeans(a) = 3.
 * */
public class MeanSum {
    int countArithmeticMeans(int[] a) {
        int count = 0;
        if (a.length == 1 && a[0] != 0) {
            return 0;
        }
        if (a.length == 1 && a[0] == 0) {
            return 1;
        }
        for (int i = 1; i < a.length - 1; ++i) {
            if (a[i - 1] + a[i + 1] == 2 * a[i]) {
                ++count;
            }
        }
        if (a[1] == 2 * a[0]) {
            ++count;
        }
        if (a[a.length - 2] == 2 * a[a.length - 1]) {
            ++count;
        }
        return count;
    }

}
