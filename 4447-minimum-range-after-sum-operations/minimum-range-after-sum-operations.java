class Solution {
    public int minRange(int a, int b, int c) {
        int ans[]=new int[3];
        ans[0]=a;
        ans[1]=b;
        ans[2]=c;
        Arrays.sort(ans);
        if(ans[2]>ans[0]+ans[1]){
            ans[2]=ans[0]+ans[1];
        }
        return ans[2]-ans[0];

    }
}