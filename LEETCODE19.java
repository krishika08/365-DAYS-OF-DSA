class Solution {
    public int maxProfit(int[] prices) {
        // Stores the minimum price so far
        // starting with the first day price
        int min = prices[0];
        // Initializing the profit to be 0 as no stock has been sold
        // Stores the maximum profit
        int profit = 0;

        // Traverse the loop through each day's stock prices
        for(int i = 0;i < prices.length; i++){
            // Checks if the current price is lower than the minimum price that has been calculated so far
            if(prices[i] < min){
                // Updates the minimum price when a lower price is found
                // better day to buy the stock
                min = prices[i];
            }

            // Calculates the today's profit and also updates the maximum profit if it is higher
            profit = Math.max(profit,prices[i] - min);
        }
        // Returns the maximum profit that can be achieved
        return profit;
    }
}
