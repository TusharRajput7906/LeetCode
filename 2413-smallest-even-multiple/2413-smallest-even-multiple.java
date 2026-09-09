class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=n;
        while(true){
            if(ans%2==0 && ans%n==0) return ans;
            ans++;
        }
    }
}