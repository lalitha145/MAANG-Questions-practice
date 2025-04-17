class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int res[]=new int[n];
        for(int b[]:bookings){
            int left=b[0]-1, right=b[1]-1;
            res[left]+=b[2];
            if(right+1<n){
            res[right+1]-=b[2];
            }

        }
        for(int i=1;i<n;i++){
            res[i]+=res[i-1];
        }
        return res;
    }
}