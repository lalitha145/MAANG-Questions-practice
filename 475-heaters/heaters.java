class Solution {
    public int findRadius(int[] houses, int[] heaters) {
         int ans=0;
         for(int house: houses){
            int minRad=Integer.MAX_VALUE;
            for(int heater:heaters){
                minRad=Math.min(minRad, Math.abs(house-heater));
            }
            ans=Math.max(ans,minRad);
         }
         return ans;
    }
}