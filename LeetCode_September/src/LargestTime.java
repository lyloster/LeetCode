import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 *
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 *
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,4]
 * Output: "23:41"
 * Example 2:
 *
 * Input: [5,5,5,5]
 * Output: ""
 *
 *
 * Note:
 *
 * A.length == 4
 * 0 <= A[i] <= 9
 * */
public class LargestTime {
    public String largestTimeFromDigits(int[] A) {

        List<int[]> permutations = permutate(A, 0);



        Iterator<int[]> itr = permutations.iterator();
        while (itr.hasNext()) {
            int[] current = itr.next();
            if (!isValid(current)) {
                itr.remove();
            }
        }

        if (permutations.isEmpty()) {
            return "";
        }

        int maxIndex = 0;

        for (int i = 1; i < permutations.size(); ++i) {
            int temp = toNumber(permutations.get(i));
            int max = toNumber(permutations.get(maxIndex));
            if (temp > max) {
                maxIndex = i;
            }
        }

//         for (int[] perm : permutations) {
//             System.out.println(Arrays.toString(perm));
//         }

        return String.format("%d%d:%d%d",
                permutations.get(maxIndex)[0],
                permutations.get(maxIndex)[1],
                permutations.get(maxIndex)[2],
                permutations.get(maxIndex)[3]);

    }

    private static List<int[]> permutate (int[] a, int index) {
        List<int[]> permutations = new ArrayList<>();

        if (index == a.length) {
            permutations.add(a);
            return permutations;
        }

        for (int i = index; i < a.length; ++i) {
            int[] aCopy = {a[0], a[1], a[2], a[3]};
            swap(i, index, aCopy);
            permutations.addAll(permutate(aCopy, index + 1));
        }

        return permutations;
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static boolean isValid(int[] arr) {
        return arr[0] * 10 + arr[1] < 24 && arr[2] * 10 + arr[3] < 60;
    }

    private static int toNumber(int[] arr) {
        return arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
    }
}
