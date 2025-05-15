class Solution {
    public int repeatedNTimes(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxDuplicateValue = Integer.MIN_VALUE;
        int maxCount = 1;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            if (frequencyMap.get(num) > maxCount || 
                (frequencyMap.get(num) == maxCount && num > maxDuplicateValue)) {
                maxCount = frequencyMap.get(num);
                maxDuplicateValue = num;
            }
        }

        return maxDuplicateValue;
    }
}