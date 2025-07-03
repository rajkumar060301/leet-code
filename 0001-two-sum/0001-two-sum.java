class Solution {
    public int[] twoSum(int[] nums, int target) {

        //I solve this problem with hasing technique
        HashMap<Integer,Integer> map = new HashMap();
        
        // fill in HashMap
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
            
        }
        
        //Searching
        for(int j = 0; j < nums.length; j++){
            int num = nums[j];
            int remainingDigit = target - num;
            if(map.containsKey(remainingDigit)){
                int index = map.get(remainingDigit);
                if(index == j)
                    continue;
                return new int []{j, index};
            }
        }
        
        return new int[]{};
        
        
        
    }
}