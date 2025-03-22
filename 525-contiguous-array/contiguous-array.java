class Solution {
    public int findMaxLength(int[] nums) {
        int ans=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(sum==0) ans=Math.max(ans,i+1);
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}