class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;  
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the current element with the element at 'index' position
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                
                // Move the 'index' forward
                index++;
            }
        }
    }
}
