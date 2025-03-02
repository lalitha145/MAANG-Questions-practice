class Solution {
    public int[] transformArray(int[] nums) {
         int res[]=Arrays.copyOf(nums,nums.length);
         for(int i=0;i<res.length;i++) {
            if(res[i]%2==0){
                res[i]=0;
            }else{
                res[i]=1;
            }
         }
         int j=0;
         for(int i=0;i<res.length;i++){
             if(res[i]==0 && res[j]!=0){
                int t=res[i];
                res[i]=res[j];
                res[j]=t;
                j++;
             }else if(res[i]!=0 && res[j]==0){
                j=i;
             }
         }
        
        return res;
        
    
    }
}