package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [2,3]
 * */
public class Solution6 {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (numbers.containsKey(nums[i])) {
                int value = numbers.get(nums[i]);
                numbers.replace(nums[i], ++value);
            } else {
                numbers.put(nums[i], 1);
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: numbers.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value != 1) {
                duplicates.add(key);
            }
        }

        return duplicates;
    }
}
