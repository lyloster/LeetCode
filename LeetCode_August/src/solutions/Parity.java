package solutions;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * */

public class Parity {
    public int[] sortArrayByParity(int[] A) {
        int[] parity = new int[A.length];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] % 2 == 0) {
                parity[even] = A[i];
                ++even;
            } else {
                parity[A.length - odd - 1] = A[i];
                ++odd;
            }
        }

        return parity;
    }

}
