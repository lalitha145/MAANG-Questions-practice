class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int res[]=new int[queries.length];
        HashMap<Integer,Integer> m1=new HashMap<>();
        HashMap<Integer,Integer> m2=new HashMap<>();
        int k=0;
        for(int a[]:queries){
            if(m1.containsKey(a[0])){
                int c=m1.get(a[0]);
                if(m2.containsKey(c)&& m2.get(c)==1){
                    m2.remove(c);
                    m2.put(a[1],m2.getOrDefault(a[1],0)+1);
                }else if(m2.containsKey(c)){
                    m2.put(c,m2.getOrDefault(c,0)-1);
                    m2.put(a[1],m2.getOrDefault(a[1],0)+1);
                }
            }else{
                m2.put(a[1],m2.getOrDefault(a[1],0)+1);
            }
            m1.put(a[0],a[1]);
            res[k++]=m2.size();
        }
        return res;
    }
}