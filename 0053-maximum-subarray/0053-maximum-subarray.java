class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];
      
        for (int i = 1; i < nums.length; ++i) {
            
            currentMax = Math.max(currentMax, 0) + nums[i];
          
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}