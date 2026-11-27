class Solution {
    public int minSteps(int n) {
        if(n==1) return 0;

        return helper(n,1,0);
    }
    int helper(int n,int cnt,int copiedAs){
        if(cnt==n) return 0;
        if(cnt>n) return (int)1e9;
        int copyAndPaste=(int)1e9;
        int pasteOnly=(int)1e9;
        if(copiedAs>0){
        pasteOnly=1+helper(n,cnt+copiedAs,copiedAs);
        }

        copyAndPaste=2+helper(n,2*cnt,cnt);
        return Math.min(pasteOnly,copyAndPaste);
    }
}