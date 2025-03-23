class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean v[]=new boolean[nums.length];
        List<Integer> l=new ArrayList<>();
        helper(ans,l,nums,0,v);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> l,int nums[],int i1,boolean v[]){
        if(l.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!v[i]){
                v[i]=true;
                l.add(nums[i]);
                helper(ans,l,nums,i1+1,v);
                l.remove(l.size()-1);
                v[i]=false;


            }

        }
    }
}