class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int length = arr.length;
       
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            indexMap.put(arr[i], i);
        }

        int[][] dp = new int[length][length];
    
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < i; ++j) {
                dp[j][i] = 2;
            }
        }
        int longestSequenceLength = 0;
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < i; ++j) {
                int prevValue = arr[i] - arr[j];
                if (indexMap.containsKey(prevValue)) {
                    int k = indexMap.get(prevValue);
                    if (k < j) {
                  
                        dp[j][i] = Math.max(dp[j][i], dp[k][j] + 1);
                        longestSequenceLength = Math.max(longestSequenceLength, dp[j][i]);
                    }
                }
            }
        }
    
        return longestSequenceLength > 2 ? longestSequenceLength : 0;
    }
}
