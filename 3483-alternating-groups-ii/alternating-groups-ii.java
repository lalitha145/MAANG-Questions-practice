class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int ans=0;
        int n=colors.length;
        int  cnt=1;
        for(int i=1;i<n+k-1;i++){
           if(colors[(i-1)%n]!=colors[i%n]) cnt++;
           else{
            cnt=1;
           }
           if(cnt>=k) ans++;
        }
        return ans;
    }

}