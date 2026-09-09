class Solution {
    public int reverse(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+(n%10);
            n/=10;
        }
        return ans;
    }
    public boolean isSameAfterReversals(int num) {
        int rev1=reverse(num);
        int rev2=reverse(rev1);
        return num==rev2;
    }
}