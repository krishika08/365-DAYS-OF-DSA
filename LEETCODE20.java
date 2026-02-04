class Solution {
    public int maxProfit(int[] prices) {
        // Initializes the variable profit with the value 0 to store the total profit
        int profit = 0;

        // loop from index 1 to the end of the prices array 
        // to compare each day's price with the previous day
        for (int i = 1; i < prices.length; i++) {
            // checks whether today's stock price is greater than the yesterday's price
            if (prices[i] > prices[i - 1]) {
                // adds the profit earned by buying the stock yesterday and selling it today
                profit += prices[i] - prices[i - 1];
            }
        }
        // returns the final calculated maximum profit
        return profit;
    }
}
