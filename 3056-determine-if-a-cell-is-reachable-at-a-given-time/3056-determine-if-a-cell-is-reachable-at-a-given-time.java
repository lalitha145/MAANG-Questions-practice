class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
     if(fx==sx && fy==sy){
            if(t > 1 || t==0)
                return true;
            return false;
         }
        
        int xDiff = Math.abs(fx-sx);
        int yDiff = Math.abs(fy-sy);
       
        if(Math.max(xDiff,yDiff) <= t)
            return true;
        return false;
    }
}