class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            // Step I: // Update the prefix sum
            sum += num; 

            // Step II: Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Step III: Add the current sum to the map (increment the frequency)
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
        
    }
}