class Solution {
    public int[] searchRange(int[] nums, int target) {
           if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[] { -1, -1 };
        // Find the leftmost occurrence of the target
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target) {
            return result;
        }
        result[0] = left;

        // Reset right index and find the rightmost occurrence of the target
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        result[1] = right;

        return result;

    }
}