import java.util.Arrays;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return uniquepaths(m, n, 0, 0, dp);
    }
    
    public int uniquepaths(int m, int n, int i, int j, int[][] dp) {
        if (i >= m || j >= n) {
            return 0;
        }
        
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = uniquepaths(m, n, i + 1, j, dp);
        int right = uniquepaths(m, n, i, j + 1, dp);

        return dp[i][j] = down + right;
    }
}