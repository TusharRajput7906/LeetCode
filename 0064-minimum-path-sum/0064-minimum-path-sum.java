class Solution {
    public int minPathSum(int[][] dp) {
        int n=dp.length;
        int m=dp[0].length;
        // int[][] dp =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) dp[i][j]=dp[i][j];
                else if(i==0) dp[i][j]=dp[i][j]+dp[i][j-1];
                else if(j==0) dp[i][j]=dp[i][j]+dp[i-1][j];
                else dp[i][j]=dp[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
    }
}

// class Solution {

//     public int cost(int i, int j, int[][] grid, int[][] dp) {

//         if (i >= grid.length || j >= grid[0].length)
//             return Integer.MAX_VALUE;

//         if (i == grid.length - 1 && j == grid[0].length - 1)
//             return grid[i][j];

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int down = cost(i + 1, j, grid, dp);
//         int right = cost(i, j + 1, grid, dp);

//         return dp[i][j] = grid[i][j] + Math.min(down, right);
//     }

//     public int minPathSum(int[][] grid) {

//         int n = grid.length;
//         int m = grid[0].length;

//         int[][] dp = new int[n][m];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         return cost(0, 0, grid, dp);
//     }
// }