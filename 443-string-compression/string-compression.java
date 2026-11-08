class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int k=0;
        for(int i=0;i<chars.length;){
            int cnt=1;
            int j=i+1;
           while(j<chars.length && chars[j]==chars[i]){
              j++;
              cnt++;
           }
           chars[k++]=chars[i];
           i=j;
           ans++;
           if(cnt==1) continue;
           String num=Integer.toString(cnt);
           for(int ind=0;ind<num.length();ind++){
            chars[k++]=num.charAt(ind);
            ans++;
           }


        }
        return ans;
    }
}