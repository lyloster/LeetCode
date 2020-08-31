package solutions;

import java.util.ArrayList;
import java.util.List;
/**
 * Finds the max sum of k consecutive integers in the two halves of an int array
 * */

public class MaxProfit {
    public static long maxProfit(int k, List<Integer> profit) {
        List<Long> calcProfit = new ArrayList<>();
        for (int i = 0; i < profit.size() / 2; ++i) {
            long current = 0;
            for (int j = 0; j < k; ++j) {
                current += profit.get(i + j);
                current += profit.get((profit.size() / 2 + j + i) % (profit.size()));
            }
            calcProfit.add(current);
        }
        long max = calcProfit.get(0);
        for(int i = 0; i < calcProfit.size(); ++i) {
            if (max < calcProfit.get(i)) {
                max = calcProfit.get(i);
            }
        }
        return max;
    }
}
