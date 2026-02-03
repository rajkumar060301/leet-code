class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }
        for(int number : nums){
            if(map.get(number)==1){
                return number;
            }
        }

        System.out.println(map);


        return 0;
    }
}