package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 *
 *
 *
 * Example 1:
 *
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 *
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 *
 * Note:
 *
 * 0 ≤ N ≤ 30.
 * */
public class FibMemo {
    public int fib(int N) {
        Map<Integer, Integer> store = new HashMap<>();
        int fibonacci = fibInternal(store, N);
        return fibonacci;
    }

    private int fibInternal(Map<Integer, Integer> store, int n) {

        //check if fibonacci is in map
        if (store.containsKey(n)) {
            return store.get(n);
        }

        //find fibonacci
        int result;
        if (n < 2) {
            result = n;
        } else {
            result = fibInternal(store, n - 1) + fibInternal(store, n-2);
        }

        //put fibonacci in map
        store.put(n, result);

        //return fibonacci
        return result;
    }
}
