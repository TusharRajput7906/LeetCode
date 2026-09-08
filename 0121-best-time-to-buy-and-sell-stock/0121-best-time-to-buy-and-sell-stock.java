class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                sell=Math.max(sell,prices[i]-buy);
                // buy=prices[i];
            }else{
                buy=prices[i];
            }
            
        }
        return sell==Integer.MIN_VALUE?0:sell;
    }
}