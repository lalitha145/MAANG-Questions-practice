class Solution {
    public int titleToNumber(String columnTitle) {
        char a[]=columnTitle.toCharArray();
        int ans=0;
        for(char c:a){
            int i=c-'A'+1;
            ans=ans*26+i;
        }
        return ans;
    }
}