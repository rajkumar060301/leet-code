class Solution {
    public int[] findErrorNums(int[] arr) {
        
        int n = arr.length;
        Map<Integer, Integer> count = new HashMap<>();
        int duplicate = 0, missing = 0;

        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (count.getOrDefault(i, 0) == 2) {
                duplicate = i;
            } else if (count.getOrDefault(i, 0) == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}