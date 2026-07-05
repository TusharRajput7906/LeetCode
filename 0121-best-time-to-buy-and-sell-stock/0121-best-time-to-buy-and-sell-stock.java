class Solution {
    public int maxProfit(int[] prices) {
        int stock=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(stock>prices[i]){
                stock=prices[i];
            }else{
                profit=Math.max(profit,prices[i]-stock);
            }
        }
        return profit;
    }
}