class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false; // s1 cannot be a permutation if it's longer

        int[] count1 = new int[26]; // Frequency array for s1
        int[] count2 = new int[26]; // Frequency array for sliding window in s2

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        // Process first window of length s1 in s2
        for (int i = 0; i < len1; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check if the first window is a valid permutation
        if (matches(count1, count2)) return true;

        for (int i = len1; i < len2; i++) {
            count2[s2.charAt(i) - 'a']++; 
            count2[s2.charAt(i - len1) - 'a']--; 

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }
}
