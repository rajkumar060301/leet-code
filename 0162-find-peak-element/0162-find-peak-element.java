import java.util.Arrays;

class Solution {
    public int findPeakElement(int[] nums) {
        // Find the maximum value
        int maxValue = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        // Print the sorted array (optional)
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxValue) {
                return i;
            }
        }

        return -1; // Should never reach here
    }
}
