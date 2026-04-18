class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int a = -1;
        int b = -1;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                a = i;
            }
            if (nums[i] == 2) {
                b = i;
            }
            if (a != -1 && b != -1) {
                diff = Math.min(diff, Math.abs(a - b));
            }
        }
        if (a == -1 || b == -1) {
            return -1;
        } else {
            return diff;
        }
    }
}