class Solution {
    public boolean even(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum%2==0;
    }
    public int countEven(int num) {
        int ans=0;
        for(int i=2;i<=num;i++){
            if(even(i)){
                ans++;
            }
        }
        return ans;
    }
}