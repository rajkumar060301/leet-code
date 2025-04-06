class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int ans = 0;
        int count = 0;
        for(int i: nums){
            if(i==1) ans = Math.max(ans, ++count);
            else count =0;
        }
        
        return ans;
    }
}