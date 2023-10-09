//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] a)
    {
      List<int[]> res=new ArrayList<>();
      Arrays.sort(a,(a1,b)->(a1[0]-b[0]));
      int s=a[0][0];
      int e=a[0][1];
      for(int i=1;i<a.length;i++){
          if(a[i][0]<=e){
              e=Math.max(e,a[i][1]);
            
          }else{
              res.add(new int[]{s,e});
              s=a[i][0];
              e=a[i][1];
          }
      }
      res.add(new int[]{s,e});
      return res.toArray(new int[0][]);
    }
}