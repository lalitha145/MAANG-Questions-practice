//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int k, int N, int prices[]) {
          int dp[][][]=new int[prices.length+1][k+1][2];
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<=k;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(dp,k,prices,0,0);
    }
    static int helper(int dp[][][],int k,int p[],int buy,int i){
        if(i==p.length || k==0){
            return 0;
        }
        if(dp[i][k][buy]!=-1){
            return dp[i][k][buy];
        }
        int pro=0;
        if(buy==0){
            pro=Math.max(-p[i]+helper(dp,k,p,1,i+1),helper(dp,k,p,0,i+1));
        }else{
            pro=Math.max(p[i]+helper(dp,k-1,p,0,i+1),helper(dp,k,p,1,i+1));
        }
        return dp[i][k][buy]=pro;
    }
}