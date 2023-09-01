class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
            m.put(i,m.getOrDefault(i,0)+1);
        
        int max=0;
        for(int i:m.keySet()){
            System.out.println(i);
       if(m.containsKey(i+1)) max=Math.max(max,m.get(i)+m.get(i+1));

        }
        
        return max;
        
    }
}