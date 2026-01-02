public class LEETCODE2 {
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buy_price) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices
        int result = maxProfit(prices);
        System.out.println("The maximum profit is: " + result);
    }
}