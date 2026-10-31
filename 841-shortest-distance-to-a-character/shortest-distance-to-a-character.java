class Solution {
    public int[] shortestToChar(String s, char c) {
        int left[]=new int[s.length()];
        int right[]=new int[s.length()];
        // Arrays.fill(ans,-1);
        for(int i=0;i<s.length();i++){
           char curr=s.charAt(i);
           if(curr==c){
            left[i]=i;
           }else{
            left[i]=i-1>=0?left[i-1]:-1;
           }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
                right[i]=i;
            }
            else{
                right[i]=i+1<s.length()?right[i+1]:-1;
            }
        }
        int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(left[i]!=-1 && right[i]!=-1) ans[i]=Math.min(i-left[i], right[i]-i);
            else {
                ans[i]=left[i]==-1? right[i]-i:i-left[i];
            }
        }
        return ans;
    }
}