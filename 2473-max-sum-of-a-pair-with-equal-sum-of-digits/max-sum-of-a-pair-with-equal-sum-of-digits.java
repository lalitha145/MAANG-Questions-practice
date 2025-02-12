class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int ele:nums){
            int sum=0;
            int temp=ele;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(map.containsKey(sum)){
                ans=Math.max(ans,ele+map.get(sum));
                if(map.get(sum)<ele){
                    map.put(sum,ele);
                }
            }else{
                map.put(sum,ele);
            }
            
        }
        return ans;
    }
}