class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                maxi = Math.max(maxi, nums[i+1]-nums[i]);
            }

        }
        return maxi;
        
    }
}