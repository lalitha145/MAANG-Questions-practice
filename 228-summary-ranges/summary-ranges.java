class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums==null || nums.length==0) return new ArrayList<>();
        List<String> ans=new ArrayList<>();

        int start=nums[0];
        int startRange=nums[0];

        for(int end=1;end<nums.length;end++){
        
            if(nums[end]!=start+1){
                if(startRange==start){
                    ans.add(""+start);

                }else{
                String temp=startRange+"->"+(start);
                ans.add(temp);
                }
               startRange=nums[end];
               start=nums[end];
            }else{
                start++;
            }
            
        }
        if(startRange!=start) {

            String temp=startRange+"->"+start;
            ans.add(temp);
        }else{
            ans.add(""+start);
        }
        return ans;
    }
}