class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[][]=new int[days.length][365+30];
        for(int d[]:dp) Arrays.fill(d,-1);
        return helper(days,costs,0,0,dp);
    }
    int helper(int days[], int costs[],int ind,int daysCovered,int dp[][]){
        if(ind>=days.length) return 0;
        
        int oneDayPass=0;
        int sevenDayPass=0;
        int thirtyDayPass=0;
        int nextPossibleDay=binarySearch(days,daysCovered);
        if(nextPossibleDay>=days.length) return 0;
        int currDay=days[nextPossibleDay];
        System.out.println(nextPossibleDay);
        if(dp[ind][daysCovered]!=-1) return dp[ind][daysCovered];

        // if(currDay<=daysCovered) return helper(days,costs,ind+1,daysCovered,dp);
        // if(currDay>daysCovered){
            oneDayPass=costs[0]+helper(days,costs,nextPossibleDay+1,currDay,dp);
            sevenDayPass=costs[1]+helper(days,costs,nextPossibleDay+1,currDay+6,dp);
            thirtyDayPass=costs[2]+helper(days,costs,nextPossibleDay+1,currDay+29,dp);
           // return Math.min(oneDayPass,Math.min(sevenDayPass,thirtyDayPass));
        // }
        return dp[ind][daysCovered]=Math.min(oneDayPass,Math.min(sevenDayPass,thirtyDayPass));
        
    }
    int binarySearch(int days[], int day){
        int low=0,high=days.length-1;
       // int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(days[mid]>day){
              high=mid-1;

            }
            else{
              //  ans=mid;
                low=mid+1;
            }
        }
        return low;
    }
}