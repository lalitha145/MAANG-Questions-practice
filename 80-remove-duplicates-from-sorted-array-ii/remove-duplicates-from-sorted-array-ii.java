class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        int k=0;
        for(int i=0;i<nums.length;){
            int j=i+1;
            int cnt=1;
            while(j<nums.length && nums[j]==nums[i]){
                cnt++;
                j++;
            }
            if(cnt>=2){
                ans+=2;
                nums[k++]=nums[i];
                nums[k++]=nums[i];
            }
            if(cnt==1){
                nums[k++]=nums[i];
                ans++;
            }
            i=j;
            
        }
        return ans;
    }
}