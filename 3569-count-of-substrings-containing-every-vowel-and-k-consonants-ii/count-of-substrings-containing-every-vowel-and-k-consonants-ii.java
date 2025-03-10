class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleast(word,k)-atleast(word,k+1);
    }
    long atleast(String word,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        String vowles="aeiou";
        int start=0;
        int cons=0;
        long sub=0;
        for(int end=0;end<word.length();end++){
            char ch=word.charAt(end);
            if(vowles.indexOf(ch)!=-1){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                cons++;
            }
            while(cons>=k && map.size()==5){
                sub+=word.length()-end;
                char c=word.charAt(start);
                if(vowles.indexOf(c)!=-1){
                    map.put(c,map.getOrDefault(c,0)-1);
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                }else{
                    cons--;
                }
            
                start++;

            }
        }
        return sub;

    }

    

}