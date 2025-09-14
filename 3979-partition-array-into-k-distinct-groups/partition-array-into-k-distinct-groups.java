class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        int grps=n/k;
        if(grps*k!=nums.length) return false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>grps) return false;
        }
        return true;

    }
}
