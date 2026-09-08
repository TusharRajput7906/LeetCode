class Solution {
    public int right(int[] colors,int i,int j){
        int ans=0;
        while(i<j){
            if(colors[i]!=colors[j]){
                return (j-i);
            }else{
                i++;
            }
        }
        return ans;
    }
    public int left(int[] colors,int i,int j){
        int ans=0;
        while(i<j){
            if(colors[i]!=colors[j]){
                return (j-i);
            }else{
                j--;
            }
        }
        return ans;
    }
    public int maxDistance(int[] colors) {
        int i=0,j=colors.length-1;
        return left(colors,i,j)>right(colors,i,j)?left(colors,i,j):right(colors,i,j);
    }
}