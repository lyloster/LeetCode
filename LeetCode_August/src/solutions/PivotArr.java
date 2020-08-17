package solutions;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class PivotArr {
    public int pivotIndex(int[] nums) {
        Map <Integer, Pair <Integer, Integer>> sums = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int indexL = 0;
            int indexR = 0;
            int left = 0;
            int right = 0;
            while (indexL < i) {
                left += nums[indexL];
                ++indexL;
            }

            while (nums.length - indexR - 1> i) {
                right += nums[nums.length - indexR - 1];
                ++indexR;
            }

            Pair<Integer,Integer> current = new Pair<>(left, right);
            sums.put(i, current);
        }

        for (int i = 0; i < sums.size(); ++i) {
            if (sums.get(i).getKey().equals(sums.get(i).getValue())) {
                return i;
            }
        }

        return -1;
    }
//    MUCH MUCH more simple && efficient
//    public int pivotIndex(int[] nums) {
//
//        int sum = 0;
//        int leftSum = 0;
//
//        for (int i = 0; i < nums.length; ++i) {
//            sum += nums[i];
//        }
//
//        for (int i = 0; i < nums.length; ++i) {
//            if (leftSum == sum - leftSum - nums[i]) {
//                return i;
//            }
//            leftSum += nums[i];
//        }
//
//        return -1;
//    }

    public static void main(String args[]) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int pivot = pivotIndex(nums);
        System.out.println(pivot);
    }
}
