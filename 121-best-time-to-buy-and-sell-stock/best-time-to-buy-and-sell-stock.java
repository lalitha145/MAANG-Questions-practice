class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;
        for(int index=0;index<prices.length;index++){
            min=Math.min(min,prices[index]);
            maxProfit=Math.max(maxProfit,prices[index]-min);
        }
        return maxProfit;

    }
}