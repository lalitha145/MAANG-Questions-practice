class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->(a[0]-b[0]));
        List<int[]> ans=new ArrayList<>();
        int start=nums[0][0], end=nums[0][1];
        for(int i=1;i<nums.length;i++){
            if(end>=nums[i][0]){
                end=Math.max(end,nums[i][1]);
            }else{
                ans.add(new int[]{start,end});
                start=nums[i][0];
                end=nums[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);
    }
}