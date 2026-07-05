class Solution {
    public int maxProfit(int[] prices) {
        int stock=prices[0];
        int profit=0;
       int i=1;
       while(i<prices.length){
            if(stock>prices[i]){
                stock=prices[i];
                i++;
            }else{
                while(i<prices.length-1 && prices[i]<prices[i+1]){
                    i++;
                }
                profit+=prices[i]-stock;
             if(i<prices.length-1){
                   stock=prices[i+1];
             }
                i+=2;
            }
        }
        return profit;
    }
}