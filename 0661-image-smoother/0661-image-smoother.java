class Solution {
    public int[][] imageSmoother(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] row = {-1,-1,-1,0,0,1,1,1};
        int[] col = {-1,0,1,-1,1,-1,0,1};

        int[][] ans = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                int count = 1;
                int sum = mat[i][j];

                for(int k = 0; k < 8; k++) {
                    int newRow = i + row[k];
                    int newCol = j + col[k];

                    if(newRow >= 0 && newRow < n &&
                       newCol >= 0 && newCol < m) {

                        sum += mat[newRow][newCol];
                        count++;
                    }
                }

                ans[i][j] = sum / count;
            }
        }

        return ans;
    }
}