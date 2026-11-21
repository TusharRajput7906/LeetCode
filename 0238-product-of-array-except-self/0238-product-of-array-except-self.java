class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n];
        pref[0]=1;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }
        int prod=nums[n-1];
        for(int i=n-2;i>=0;i--){
            pref[i]=pref[i]*prod;
            prod*=nums[i];
        }
        return pref;
    }
}