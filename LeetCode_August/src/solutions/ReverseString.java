package solutions;
/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 * */
public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        reverseStringInt(s, i, s.length - 1 - i);

    }

    public void reverseStringInt(char[] s, int begin, int end){
        if (begin >= s.length/2) {
            return;
        }
        swap(s, begin, end);
        reverseStringInt(s, begin + 1, end - 1);
    }

    public void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
