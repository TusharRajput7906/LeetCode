class Solution {
    int helper(int i,int sum,int[] coins,int[][] dp){
        if(i==coins.length){
            if(sum==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][sum]!=0) return dp[i][sum];
        int skip=helper(i+1,sum,coins,dp);
        if(sum<coins[i]) return dp[i][sum]= skip;
        int take=helper(i,sum-coins[i],coins,dp);
        int pick=(take==Integer.MAX_VALUE)?take:take+1;
        return dp[i][sum] =  Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[][] dp=new int[coins.length][amount+1];
        int ans=helper(0,amount,coins,dp);
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}