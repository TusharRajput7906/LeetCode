class Solution {
    public int leng(int n){
        String str=Integer.toString(n);
        return str.length();
    }
    public int[] findColumnWidth(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max=Math.max(max,leng(grid[j][i]));
            }
            arr[i]=max;
        }
        return arr;
    }
}