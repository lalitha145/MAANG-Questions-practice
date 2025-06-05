class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character,List<Character>> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char u=s1.charAt(i);
            char v=s2.charAt(i);
            map.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            map.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        for(char ch: baseStr.toCharArray()){
            boolean vis[]=new boolean[26];
            char minChar=dfs(ch, map, vis);
            ans.append(minChar);
        }
        return ans.toString();
    }
    char dfs(char ch,HashMap<Character,List<Character>> map,boolean vis[]){
        vis[ch-'a']=true;
        char ans=ch;
        for(char nb:map.getOrDefault(ch,new ArrayList<>())){
            if(!vis[nb-'a']){
                char minChar=dfs(nb,map,vis);
                if(minChar<ans){
                    ans=minChar;
                }
            }
        }
        return ans;
    }
}