class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>buy){
                sell+=prices[i]-buy;
                // i++;
                buy=prices[i];
            }else{
                buy=prices[i];
            }
        }
        return sell;
    }
}