package solutions;
/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 5
 * Output: false
 * Follow up: Could you solve it without loops/recursion?
 * */
public class Solution4 {
    public boolean isPowerOfFourInternal(int num) {
        if (num == 1) {
            return true;
        }
        if (num % 4 != 0) {
            return false;
        }
        return isPowerOfFourInternal(num / 4);
    }

    public boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        } else {
            return isPowerOfFourInternal(num);
        }
    }
}
