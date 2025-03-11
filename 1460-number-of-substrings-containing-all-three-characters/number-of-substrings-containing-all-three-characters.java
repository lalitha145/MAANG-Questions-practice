class Solution {
    public int numberOfSubstrings(String s) {
        int cnt[]={0,0,0};
        int ans=0,j=0;
        for(int i=0;i<s.length();i++){
           cnt[s.charAt(i)-'a']++;
            while(cnt[0]>0 && cnt[1]>0 && cnt[2]>0){
                cnt[s.charAt(j)-'a']--;
                j++;
            }
            ans+=j;
        }
        return ans;
    }
}