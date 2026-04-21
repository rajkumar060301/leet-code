import java.util.*;

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if (nums.length < 2) {
            return new int[]{-1, -1};
        }

        // Step 1: Frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort unique numbers
        List<Integer> list = new ArrayList<>(freq.keySet());
        Collections.sort(list);

        // Step 3: Try pairs
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int y = list.get(j);

                if (!freq.get(x).equals(freq.get(y))) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{-1, -1};
    }
}