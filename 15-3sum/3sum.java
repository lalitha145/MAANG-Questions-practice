class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int sum=0;
             int j=i+1,k=nums.length-1;
             while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
             }
        }
        return new ArrayList(ans);
    }
}