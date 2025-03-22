class Solution {
    public int longestPalindrome(String s) {
            HashMap<Character,Integer> map=new HashMap<>();
            int ans=0;
            boolean b=true;
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int maxOdd=0;
            char ch='a';
            System.out.println(map);
            for(char key:map.keySet()){
                if(map.get(key)%2==0) ans+=map.get(key);
                if(map.get(key)%2==1) {
                    if(maxOdd<map.get(key)){
                        ch=key;
                        maxOdd=map.get(key);
                    }
                }
            }
            ans+=maxOdd;
            for(char k:map.keySet()){
                if(map.get(k)%2==1 && k!=ch) ans+=map.get(k)-1;
            }
            return ans;
    }
}