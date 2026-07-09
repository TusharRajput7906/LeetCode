class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}

// class Solution {
//     public int cal(int[] dp, int[] cost, int idx) {
//         if (idx >= cost.length)
//             return 0;
//         if (dp[idx] != -1)
//             return dp[idx];
//         int onestep = cost[idx] + cal(dp, cost, idx + 1);
//         int twostep = cost[idx] + cal(dp, cost, idx + 2);
//         return dp[idx] = Math.min(onestep, twostep);
//     }

//     public int minCostClimbingStairs(int[] cost) {
//         int[] dp = new int[cost.length];
//         Arrays.fill(dp, -1);
//         return Math.min(cal(dp, cost, 0), cal(dp, cost, 1));
//     }
// }