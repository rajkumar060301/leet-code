import java.util.HashMap;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Check if all frequency values are the same
        int freq = -1;
        for (int count : freqMap.values()) {
            if (freq == -1) {
                freq = count; // Set initial frequency
            } else if (freq != count) {
                return false; // Found a different frequency
            }
        }

        return true;
    }
}
