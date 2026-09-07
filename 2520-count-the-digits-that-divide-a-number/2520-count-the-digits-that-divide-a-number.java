class Solution {
    public int countDigits(int num) {
        int n=num;
        int ans=0;
        while(n>0){
            int rem=n%10;
            if(num%rem==0){
                ans++;
            }
            n/=10;
        }
        return ans;
    }
}