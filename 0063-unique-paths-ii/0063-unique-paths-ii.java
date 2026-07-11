class Solution {
    public int unique(int i, int j, int[][] grid, int[][] dp) {
        if (i >= grid.length || j >= grid[0].length)
            return 0;

        if (grid[i][j] == 1)
            return 0;

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return 1;
        if (dp[i][j] != -1)
            return dp[i][j];
        int left = unique(i + 1, j, grid, dp);
        int right = unique(i, j + 1, grid, dp);
        return dp[i][j] = left + right;
    }

    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return unique(0, 0, grid, dp);
    }
}

// class Solution {
//     public int uniquePathsWithObstacles(int[][] arr) {
//         int m=arr.length;
//         int n=arr[0].length;
//         int[][] res= new int[m][n];
//         if(arr[0][0]==1) return 0;
//         res[0][0]=1;
//         for(int i=1;i<m;i++){
//             if(arr[i][0]==0){
//                 res[i][0]=res[i-1][0];
//             }
//             }

//         for(int i=1;i<n;i++){
//             if(arr[0][i]==0){
//                 res[0][i]=res[0][i-1];
//             }
//         }
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                if(arr[i][j]==0){
//                 res[i][j]=res[i-1][j]+res[i][j-1];
//                }
//             }
//         }
//         return res[m-1][n-1];
//     }
// }