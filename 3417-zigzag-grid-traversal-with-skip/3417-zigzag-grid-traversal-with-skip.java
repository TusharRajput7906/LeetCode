class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int n=grid.length;;
        int m=grid[0].length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<m;j++){
                if((i+j)%2==0){
                    ans.add(grid[i][j]);
                }
            }
            }else{
                for(int j=m-1;j>=0;j--){
                   if((i+j)%2==0){
                    ans.add(grid[i][j]);
                }
                }
            }
        }
        return ans;
    }
}