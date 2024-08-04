package mediumLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 27-Aug-22
 */

import java.util.Arrays;

public class Q3_longestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        Q3_longestSubstring ls = new Q3_longestSubstring();
        System.out.println(ls.lengthOfLongestSubstring(str));


    }

    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        int res = 0; // result

        // last index of all characters is initialized
        // as -1
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        // Initialize start of current window
        int i = 0;

        // Move end of current window
        for (int j = 0; j < n; j++) {

            // Find the last index of str[j]
            // Update i (starting index of current window)
            // as maximum of current value of i and last
            // index plus 1
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);

            // Update result if we get a larger window
            res = Math.max(res, j - i + 1);

            // Update last index of j.
            lastIndex[str.charAt(j)] = j;
        }
        return res;


    }
}
