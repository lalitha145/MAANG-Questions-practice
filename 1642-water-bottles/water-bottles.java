class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=0;
       // int full=numBottles;
       empty=numBottles;
        while(empty/numExchange>0 ){
            int full=(empty/numExchange);
            ans+=full;
            empty=(empty%numExchange)+full;
           
           
        }
        return ans;
    }
}