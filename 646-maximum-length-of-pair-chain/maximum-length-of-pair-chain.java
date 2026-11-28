class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->{
            if(a[1]==b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
        for(int p[]:pairs){
            System.out.println(Arrays.toString(p));
        }
        int ans=1;
        int prevA=pairs[0][0];
        int prevB=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>prevB){
                ans++;
                prevA=pairs[i][0];
                prevB=pairs[i][1];
            }
        }
        return ans;
    }
}