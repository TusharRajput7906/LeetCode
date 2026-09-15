class Solution {
    public int maximumWealth(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return max;
    }
}