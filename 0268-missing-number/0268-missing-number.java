class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        int count = 0;
        for(int num : nums){
            count= count + num;
        }

        return sum - count;

    }
}