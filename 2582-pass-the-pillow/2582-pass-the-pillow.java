class Solution {
    public int passThePillow(int n, int time) {
        int j = 1;
        boolean flag=true;
        while (time > 0) {
            if (j ==n) {
                flag=false;
            } 
            if(j==1){
                flag=true;
            }
            if(flag){
                j++;
            }else{
                j--;
            }
            time--;
        }
        return j;
    }
}