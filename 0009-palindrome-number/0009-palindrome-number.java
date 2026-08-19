class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a=x;
        int ans=0;
        while(a>0){
            int rem=a%10;
            ans=ans*10+rem;
            a/=10;
        }
        return x==ans;
    }
}