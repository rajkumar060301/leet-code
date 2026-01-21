class Solution {
    public int findDuplicate(int[] nums) {
        int index =0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[index]==nums[i]){
                return nums[i];
            }
            index++;

        }

        return 0;
    }
}