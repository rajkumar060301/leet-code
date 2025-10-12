class Solution {
    int[] dp;
    int[] a;
    int k;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        a = arr;
        this.k = k;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return sum(0);
    }
    private int sum(int i){
        if(i == a.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int maxSum = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int len = 0;
        for(int j = i; j < Math.min(a.length, i + k); j++){
            len++;
            maxVal = Math.max(maxVal, a[j]);
            maxSum = Math.max(maxSum, maxVal * len + sum(j + 1));
        }
        return dp[i] = maxSum;
    }
}