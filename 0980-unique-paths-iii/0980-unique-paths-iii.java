class Solution {
    int ans=0;
    public boolean visited(int[][] grid){
       int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=-1 && grid[i][j]!=2){
                    return false;
                }
            }
        } 
        return true;
    }
    public void findPath(int r,int c,int[][] grid,int n, int m){
        if(r<0 || c<0 || r>=n || c>=m || grid[r][c]==-1){
            return;
        }
        if(grid[r][c]==2 && visited(grid)){
            ans++;
            return;
        }
        if(grid[r][c]==2){
            return;
        }
        grid[r][c]=-1;
        findPath(r+1,c,grid,n,m);
        findPath(r-1,c,grid,n,m);
        findPath(r,c+1,grid,n,m);
        findPath(r,c-1,grid,n,m);
        grid[r][c]=0;
    }
    public int uniquePathsIII(int[][] grid) {
        // ans =0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    findPath(i,j,grid,n,m);
                    break;
                }
            }
        }
        return ans;
    }
}