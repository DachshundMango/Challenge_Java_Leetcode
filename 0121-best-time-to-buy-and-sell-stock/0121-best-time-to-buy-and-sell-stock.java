class Solution {
    public int maxProfit(int[] prices) {

        int maxValue = prices[prices.length - 1];
        int result = 0;
        
        for (int i = 0; i < prices.length; i++){
            if (maxValue < prices[prices.length - 1 - i]) {
                maxValue = prices[prices.length - 1 - i];
            } else if (result < maxValue - prices[prices.length - 1 - i]) {
                result = maxValue - prices[prices.length - 1 - i];
            }
        }

        return result;

        

        
    }
}