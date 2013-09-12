package besttimesellstock2;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;

        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }
    
    public static void main(String[] agrs) {
    	Solution sol = new Solution();
    	int[] sample = {1,9,10,11,100};
    	System.out.println(sol.maxProfit(sample));
    }
}