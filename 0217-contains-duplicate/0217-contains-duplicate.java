class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int num : nums){
            set.add(num);
        }
        return len == set.size() ? false : true;
    }
}