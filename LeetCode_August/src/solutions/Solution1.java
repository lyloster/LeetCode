package solutions;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 *
 *
 * Example 1:
 *
 * Input: "USA"
 * Output: True
 *
 *
 * Example 2:
 *
 * Input: "FlaG"
 * Output: False
 *
 *
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class Solution1 {
    /**
     * Returns whether the {@code word} is properly capitalized.
     *
     * @param word the word being checked
     * @return whether the {@code word} is correctly capitalized
     */
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for (int i = 0; i < word.length(); ++i) {
            if(Character.isUpperCase(word.charAt(i))) {
                ++caps;
            }
        }

        if (caps == word.length()) {
            return true;
        } else if (word.length() - caps == word.length() - 1) {
            if (Character.isUpperCase(word.charAt(0))) {
                return true;
            } else {
                return false;
            }
        } else if (caps == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.detectCapitalUse("Hello"));
    }
}
