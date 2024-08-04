package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 28-Apr-22
 */

public class Q392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m > n) {
            return false;
        }

        int i = 0, j = 0;

        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;


    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "axbyc";
        System.out.println(isSubsequence(str1, str2));

    }
}
