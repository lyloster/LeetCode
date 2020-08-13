package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 * */
public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascal = new ArrayList<>();
        if (rowIndex == 0) {
            pascal.add(1);
            return pascal;
        }

        if (rowIndex == 1) {
            pascal.add(1);
            pascal.add(1);
            return pascal;
        }

        pascal = getRow(rowIndex - 1);
        List<Integer> fullList = new ArrayList<>();
        fullList.add(1);
        for (int i = 0; i < pascal.size() - 1; ++i) {
            int temp = pascal.get(i) + pascal.get(i + 1);
            fullList.add(temp);
        }
        fullList.add(1);
        return fullList;
    }
}
