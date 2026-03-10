class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        int n = values.length;
        List<int[]> nums = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nums.add(new int[]{values[i], labels[i]});
        }
        // sort by values in descending order
        Collections.sort(nums, (x, y) -> Integer.compare(y[0], x[0]));
        int ans = 0;
        int used = 0;
        Map<Integer, Integer> usedCnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int label = nums.get(i)[1];
            int newUsedCount = usedCnt.getOrDefault(label, 0) + 1;
            if (newUsedCount <= useLimit) {
                used++;
                if (used > numWanted) {
                    break;
                }
                ans += nums.get(i)[0];
                usedCnt.put(label, newUsedCount);
            }
        }
        return ans;
    }
}