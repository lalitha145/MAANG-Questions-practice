class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> pre=new ArrayList<>();
        for(int ele:nums) pre.add(ele);
        for(int i=0;i<nums.length;i++){
            List<Integer> curr=new ArrayList<>();
            for(int j=0;j<pre.size()-1;j++){
             curr.add((pre.get(j)+pre.get(j+1))%10);
            }
            if(curr.size()>0){
            pre=curr;
            }
        }
        return pre.get(0);
    }
}