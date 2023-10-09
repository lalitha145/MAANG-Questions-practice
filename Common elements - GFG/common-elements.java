//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int ar1[], int ar2[], int ar3[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
     int i = 0, j = 0, k = 0;
 
        
        while (i < ar1.length && j < ar2.length
               && k < ar3.length) {
          
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                if(!ans.contains(ar1[i]))
                     ans.add(ar1[i]);
                i++;
                j++;
                k++;
            }
 
            // x < y
            else if (ar1[i] < ar2[j])
                i++;
 
            // y < z
            else if (ar2[j] < ar3[k])
                j++;
 
            
            else
                k++;
        }
    
    return ans;
    }
}