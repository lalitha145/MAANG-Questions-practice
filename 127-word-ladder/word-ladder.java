
class Pair{
    String str;
    int dep;
    public Pair(String str,int dep){
        this.str=str;
        this.dep=dep;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        HashSet<String> set=new HashSet<>(wordList);
        while(!q.isEmpty()){
            Pair poll=q.poll();
            String word=poll.str;
            int depth=poll.dep;
            if(word.equals(endWord)) return depth;
            char a[]=word.toCharArray();
            for(int i=0;i<a.length;i++){
                char prev=a[i];
                for(char c='a';c<='z';c++){
                    a[i]=c;
                    if(set.contains(new String(a))){
                        set.remove(new String(a));
                        q.add(new Pair(new String(a),depth+1));

                    }
                    a[i]=prev;

                    
                }
            
            }

        }
        return 0;
    }
}