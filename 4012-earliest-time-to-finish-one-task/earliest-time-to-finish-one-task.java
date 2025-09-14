class Solution {
    public int earliestTime(int[][] tasks) {
        int minTime=Integer.MAX_VALUE;
        for(int task[]:tasks){
            minTime=Math.min(minTime, task[0]+task[1]);
        }
        return minTime;
    }
}