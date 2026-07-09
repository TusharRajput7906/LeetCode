class Solution {
    public int loot(int i ,int end ,int[] nums,int[] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int total=nums[i]+loot(i+2,end,nums,dp);
        int leave=loot(i+1,end,nums,dp);
        return dp[i]=Math.max(total,leave);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        for(int i=0;i<n;i++){
            dp1[i]=-1;
            dp2[i]=-1;
        }
        int case1=loot(0,n-2,nums,dp1);
        int case2=loot(1,n-1,nums,dp2);
        return Math.max(case1,case2);
    }
}