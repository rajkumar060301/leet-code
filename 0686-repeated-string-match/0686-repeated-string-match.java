class Solution {
    public int repeatedStringMatch(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n; i++) {
            int rep = 1, idx1 = i;
            boolean found = true;
            for (int idx2 = 0; idx2 < m; idx2++) {
                if (s1.charAt(idx1) != s2.charAt(idx2)) {
                    found = false;
                    break;
                }
                idx1++;

                if (idx1 == n) {
                    idx1 = 0;

                    if (idx2 != m - 1)
                        rep++;
                }
            }

            if (found)
                return rep;
        }

        return -1;
    }
}