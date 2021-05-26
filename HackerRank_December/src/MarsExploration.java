import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/mars-exploration/problem
 */

public class MarsExploration {


        static int marsExploration(String s) {
            int changed = 0;
            for (int i = 0; i < s.length(); i = i + 3) {
                if ('S' != s.charAt(i)) {
                    ++changed;
                }

                if ('O' != s.charAt(i + 1)) {
                    ++changed;
                }

                if ('S' != s.charAt(i + 2)) {
                    ++changed;
                }
            }
            return changed;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scanner.nextLine();

            int result = marsExploration(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
}
