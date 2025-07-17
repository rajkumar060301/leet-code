class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] indexedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }

        Arrays.sort(indexedNums, (a, b) -> Integer.compare(b[0], a[0]));

        List<int[]> topK = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topK.add(indexedNums[i]);
        }

        topK.sort(Comparator.comparingInt(a -> a[1]));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK.get(i)[0];
        }

        return result;
    }
}