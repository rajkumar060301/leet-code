class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int mid = len/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > mid) {
                return nums[i];

            }
        }

        return -1;    }
}