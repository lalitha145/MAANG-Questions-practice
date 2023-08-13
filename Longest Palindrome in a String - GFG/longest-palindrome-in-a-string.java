//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
 static String longestPalin(String S) {
        int start=0;
        int maxlength=1;
        boolean dp[][]=new boolean[S.length()][S.length()];
        for(int i=0;i<S.length();i++){
            dp[i][i]=true;
        }
        for(int len=2;len<=S.length();len++){
            for(int i=0;i<S.length()-len+1;i++){
                int j=i+len-1;
                if(S.charAt(i)==S.charAt(j)){
                    if(len==2 || dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        if(maxlength<len){
                        start=i;
                        maxlength=Math.max(maxlength,len);
                        }
                    }
                }
            }
        }
     return S.substring(start,start+maxlength);
    }
}