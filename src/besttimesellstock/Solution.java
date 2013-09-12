package besttimesellstock;

public class Solution {
	public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length < 2) return 0;
        int minIndex = 0;
        int profit = 0;
        for (int i = 0; i <prices.length; i++) {
            if (prices[i] < prices[minIndex])
                minIndex = i;
            profit = prices[i] - prices[minIndex] > profit ? prices[i] - prices[minIndex] : profit;
        }
        
        return profit;
        
    }
}
