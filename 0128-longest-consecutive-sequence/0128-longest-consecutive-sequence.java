class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int number : set){
            if(!set.contains(number -1)){
                int currentNumber = number;
                int currentStreak = 1;

                while(set.contains(currentNumber  + 1)){
                    currentNumber++;
                    currentStreak++;
                }
                count = Math.max(count, currentStreak );

            }

        }
        return count;
    }

}