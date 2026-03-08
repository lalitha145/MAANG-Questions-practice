class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int size=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize) {
                if(size>capacity[i]){
                    size=capacity[i];
                    index=i;
                }
            }
        }
        return index;
    }
}