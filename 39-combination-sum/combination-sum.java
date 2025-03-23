class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),0,target,candidates);
        return ans;
    }
    void helper(List<List<Integer>> ans,List<Integer> l,int i,int target,int nums[]){
        if(i>=nums.length || target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        helper(ans,l,i,target-nums[i],nums);
        l.remove(l.size()-1);
        helper(ans,l,i+1,target,nums);
    }
}