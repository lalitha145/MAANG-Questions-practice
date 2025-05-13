class Pair{
    char c;
    int fre;
    public Pair(char c, int fre){
        this.c=c;
        this.fre=fre;
    }
}
class Solution {
    public int minDeletion(String s, int k) {
        if(s.length()<=1) return 0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.fre-b.fre);


        System.out.println(map);
        for(char ch:map.keySet()){
            pq.add(new Pair(ch,map.get(ch)));
        }
       
        while(pq.size()>k){
            ans+=pq.poll().fre;

        }
        return ans;

    }
}