package hell;

public class practiceHell {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        return helper(obstacleGrid, 0, 0, dp, m, n);


    }

    public int helper(int[][] grid, int i, int j, int[][] dp, int m, int n){
        if(i==m || j==n || grid[i][j]==1)
            return 0;

        if(i==m-1 && j==n-1){
            if(grid[i][j]==1)
                return 0;
            return 1;
        }

        if(dp[i][j]>0){
            return dp[i][j];
        }
        return dp[i][j] = helper(grid, i+1, j, dp, m, n) + helper(grid, i, j+1, dp, m, m);
    }
}
