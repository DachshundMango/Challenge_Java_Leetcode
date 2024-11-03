class Solution {
    public int maxProfit(int[] prices) {

        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maximumProfit) {
                    maximumProfit = profit;
                }
            }

            if (prices[i] == 0) {
                break;
            }

        }

        return maximumProfit;
    }
}