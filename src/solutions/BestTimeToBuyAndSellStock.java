package solutions;

public class BestTimeToBuyAndSellStock{
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0, max_profit = 0;
        for(int i=0 ; i<prices.length ; i++){
            min = Math.min(prices[i],min);
            profit = prices[i] - min;
            max_profit = Math.max(profit , max_profit);
        }
        return max_profit;
    }
}