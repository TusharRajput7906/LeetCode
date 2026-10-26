class Solution {
    public int count(int n){
        int ans=0;
        while(n>0){
            if(n%2!=0){
                ans++;
            }
            n/=2;
        }
        return ans;
    }
    public int calculateScore(int a, int b) {
        // int s1=Integer.bitCount(a);
        // int s2=Integer.bitCount(b);

        int s1=count(a);
        int s2=count(b);
        if(s1>=s2){
            return s1*s2;
        }
        return s2/s1;
    }
}