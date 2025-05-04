class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int hash[]=new int[100];
        int ans=0;
        for(int domino[]:dominoes){
            int a=domino[0];
            int b=domino[1];
            int hashKey=a>b? a*10+b: b*10+a;
            ans+=hash[hashKey];
            hash[hashKey]++;
        }
        return ans;
    }
}