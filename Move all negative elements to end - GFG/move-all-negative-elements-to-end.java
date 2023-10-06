//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot = new  PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            ot.print(a[i]+" ");
            
            ot.println();
        }
        ot.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int a[], int n)
    {
        // Your code goes here
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            t[i]=a[i];
        }
        int ind=0;
        int i=0;
        while(ind<n){
            if(t[ind]>0){
                a[i]=t[ind];
                i++;
                
            }
            ind++;
        }
        int negI=0;
      
        while(negI<n){
            if(t[negI]<0){
                a[i]=t[negI];
                i++;
            }
            negI++;
        }
    }
}