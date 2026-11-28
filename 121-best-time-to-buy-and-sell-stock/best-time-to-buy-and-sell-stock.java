class Solution {
    public int maxProfit(int[] prices) {
     
    
    return helper(prices,1,prices[0]);
    }
    int helper(int p[],int i,int min){
         if(i>=p.length) return 0;
         int profit=0;
         profit=Math.max(p[i]-min,helper(p,i+1,Math.min(min,p[i])));
         return profit;
        

    }
}