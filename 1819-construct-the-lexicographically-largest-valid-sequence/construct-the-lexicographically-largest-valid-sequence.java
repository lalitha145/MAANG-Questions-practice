class Solution {
    public int[] constructDistancedSequence(int n) {
        int res[]=new int[2*n-1];
        boolean used[]=new boolean[n+1];
        helper(res,used,n,0);
        return res;
    }
    boolean helper(int res[],boolean used[],int n,int ind){
        while(ind<res.length && res[ind]!=0){
            ind++;
        }
        if(ind==res.length) return true;
        for(int i=n;i>=1;i--){
            if(used[i]) continue;
            if(i==1){
                res[ind]=1;
                used[i]=true;
                if(helper(res,used,n,ind+1)) return true;
                res[ind]=0;
                used[i]=false;
            }else if(i+ind<res.length && res[i+ind]==0){
                res[ind]=i;
                res[i+ind]=i;
                used[i]=true;
                if(helper(res,used,n,ind+1)) return true;
                res[ind]=0;
                res[ind+i]=0;
                used[i]=false;
            }
        }
        return false;
    }
}