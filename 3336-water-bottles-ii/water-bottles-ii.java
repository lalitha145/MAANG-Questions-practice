class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            empty-=numExchange;
            ans++;
            empty++;
            numExchange++;
        }
        return ans;
    }
}