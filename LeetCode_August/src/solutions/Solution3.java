package solutions;
/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 *
 *
 * Constraints:
 *
 * s consists only of printable ASCII characters.
 * */
public class Solution3 {
    public boolean isPalindrome(String s) {

        String lowerCase = s.toLowerCase();
        //StringBuffer runs faster when compiler is not optimized for +=
        StringBuffer processed = new StringBuffer("");
        for (int j = 0; j < s.length(); ++j) {
            if (lowerCase.charAt(j) >= 'a' && lowerCase.charAt(j) <= 'z'
                    || lowerCase.charAt(j) >= '0' && lowerCase.charAt(j) <= '9') {
                processed.append(lowerCase.charAt(j));
            }
        }

        //String processed = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();

        for (int i = 0; i < processed.length()/2; ++i) {
            if (processed.charAt(i) != processed.charAt(processed.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
