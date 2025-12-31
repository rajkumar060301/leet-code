class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        // Step I: Iterate through the array
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            // Step II: Accumulate the sum for subarrays starting from 'start'
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
        
    }
}