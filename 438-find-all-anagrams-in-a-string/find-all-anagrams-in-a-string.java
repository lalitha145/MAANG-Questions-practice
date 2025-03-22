class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int freS[]=new int[26];
        int freP[]=new int[26];
        for(int i=0;i<p.length();i++){
            freS[s.charAt(i)-'a']++;
            freP[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(freS,freP)) ans.add(0);
        int l=0;
        for(int i=p.length();i<s.length();i++){
            freS[s.charAt(l)-'a']--;
            freS[s.charAt(i)-'a']++;
            if(Arrays.equals(freS,freP)) ans.add(l+1);
            l++;

        }
        return ans;
    }
}