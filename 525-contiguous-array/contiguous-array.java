class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            sum+=ele==1?1:-1;
            System.out.println(sum);
            if(map.containsKey(sum)){
                ans=Math.max(ans, i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(map);
        return ans;
    }
}