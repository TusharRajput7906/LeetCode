class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
                left++;
                right--;
            }
        }
        // for(int i=0;i<n;i++){
        //     int left=0;
        //     int right=n-1;
        //     while(left<right){
        //         int temp=matrix[i][right];
        //         matrix[i][right]=matrix[i][left];
        //         matrix[i][left]=temp;
        //         left++;
        //         right--;
        //     }
        // }
    }
}