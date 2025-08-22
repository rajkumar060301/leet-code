class Solution {
    public int removeElement(int[] nums, int val) {
        int prevIndex = 0;
        for (int index = 0; index < nums.length; index++){
            if (nums[index] == val)
                continue;
            nums[prevIndex++] = nums[index];
        }
        return prevIndex;
    }
}