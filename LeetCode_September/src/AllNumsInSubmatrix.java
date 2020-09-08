/**
 *  You are given numbers, a 3 × n matrix which contains only digits from 1 to 9. Consider a sliding window of size 3
 *  × 3, which is sliding from left to right through the matrix numbers. The sliding window has n - 2 positions when sliding through the initial matrix.
 *  Your task is to find whether or not each sliding window position contains all the numbers from 1 to 9 (inclusive).
 *  Return an array of length n - 2, where the ith element is true if the ith state of the sliding window contains
 *  all the numbers from 1 to 9, and false otherwise.
 *  Example
 *  For numbers = [[1, 2, 3, 2, 5, 7],
 *                  [4, 5, 6, 1, 7, 6],
 *                  [7, 8, 9, 4, 8, 3]]
 *  the output should be isSubmatrixFull(numbers) = [true, false, true, false].
 *  A matrix containing only digits from 1 to 9.
 *
 *         Guaranteed constraints:
 *         numbers.length = 3,
 *         3 ≤ numbers[i].length ≤ 100,
 *         1 ≤ numbers[i][j] ≤ 9.
 */

public class AllNumsInSubmatrix {

    boolean[] isSubmatrixFull(int[][] numbers) {
        int size = numbers[0].length - 2;
        boolean[] check = new boolean [size];

        for (int i = 0; i < check.length; ++i) { //nums of submatrix
            boolean[] allNums = new boolean[9];
            for (int k = 0; k < 3; ++k) {
                for (int j = 0; j < 3; ++j) {
                    allNums[numbers[j][k + i] - 1] = true;
                }
            }
            check[i] = allNumsIn(allNums);
        }
        return check;
    }
    boolean allNumsIn (boolean[] allNums) {
        int trues = 0;
        for (int k = 0; k < allNums.length; ++k) {
            if (allNums[k] == true) {
                ++trues;
            }
        }
        if (trues == 9) {
            return true;
        } else{
            return false;
        }
    }
}
