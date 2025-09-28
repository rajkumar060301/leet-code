class Solution {
    public int findMin(int[] nums) {
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){  // please do it with binary search
            maxi = Math.min(nums[i] , maxi);
        }
        return maxi;
    }
}