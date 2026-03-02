class Solution {
    public int findMinPath(int i,int j, int[][] grid,int[][] dp){
        if(i == 0 && j == 0){
            return grid[i][j];
        }
        if(i < 0 || j < 0){
            return 1000000;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = grid[i][j] + findMinPath(i - 1,j,grid,dp);
        int left = grid[i][j] + findMinPath(i , j - 1,grid,dp);
        dp[i][j] = Math.min(up,left);
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++){
            Arrays.fill(dp[i],-1);
        }
        return findMinPath(m - 1,n - 1,grid,dp);
    }
}