class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    HashMap<Integer,List<Integer>> hs=new HashMap();
    List<List<Integer>> ans = new ArrayList();
    for(int i=0;i<groupSizes.length;i++)
    {
        hs.putIfAbsent(groupSizes[i],new ArrayList<>());
        hs.get(groupSizes[i]).add(i);
        if(hs.get(groupSizes[i]).size()==groupSizes[i])
        {
            ans.add(hs.get(groupSizes[i]));
            hs.remove(groupSizes[i]);
        }

    }
        return ans;
    }

}