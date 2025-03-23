class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    void helper(int nums[],int i,List<Integer> l,List<List<Integer>> ans){
        if(i>=nums.length)
        { 
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        helper(nums,i+1,l,ans);
        l.remove(l.size()-1);
        helper(nums,i+1,l,ans);
    }
}