class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int maxFre=0;
        String ans="";
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            maxFre=Math.max(maxFre,map.get(c));
        }
        int maxD=0;
        int freNeeded=0;
        for(int i=1;i<=maxFre;i++){
            int cnt=0;
            for(char key:map.keySet()){
                if(map.get(key)==i) cnt++;
            }
            if(maxD<=cnt){
                freNeeded=i;
               maxD=Math.max(maxD,cnt);
            }
        }
        System.out.println(map);
        
        for(char c:map.keySet()){
            if(map.get(c)==freNeeded)ans+=c;
        }
        return ans;


    }
}