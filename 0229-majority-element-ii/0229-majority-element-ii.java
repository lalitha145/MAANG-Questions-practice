class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i:nums){
           m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int k:m.keySet()){
            if(m.get(k)>nums.length/3){
                a.add(k);
            }
        }
        return a;
        
    }
}