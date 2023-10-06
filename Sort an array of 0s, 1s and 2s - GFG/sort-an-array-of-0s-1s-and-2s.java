//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
       int c0=0;
       int c1=0;
       int c2=0;
       for(int i:a){
           if(i==0){
               c0++;
           }else if(i==1){
               c1++;
           }else{
               c2++;
           }
       }
       int ind=0;
       while(c0>0){
           a[ind]=0;
           c0--;
           ind++;
       }
       while(c1>0){
           a[ind]=1;
           c1--;
           ind++;
       }
       while(c2>0){
           a[ind]=2;
           c2--;
           ind++;
       }
       
      
      
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends