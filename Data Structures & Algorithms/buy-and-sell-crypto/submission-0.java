class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int maxProfit = 0;
        int currIndex = buyIndex+1;

        while(currIndex < prices.length) {
            int currAmount = prices[currIndex];
            int buyPrice = prices[buyIndex];
            if( currAmount < buyPrice) {
                buyIndex = currIndex;
                currIndex++;
            } else {
                int currProfit = currAmount - buyPrice;
                if(currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
                currIndex++;
            }
        }

        return maxProfit;


        
    }
}
