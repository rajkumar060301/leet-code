class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum =0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // map.keySet().forEach(key -> {
        //     if(map.get(key)%2==0){
        //         sum = sum + (int) Math.pow(key, map.get(key));
        //     }
        // });
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int number : set){
            if(map.get(number)%k==0){
                sum = sum + (number * map.get(number));
            }
        }


        return sum;
        
    }
}