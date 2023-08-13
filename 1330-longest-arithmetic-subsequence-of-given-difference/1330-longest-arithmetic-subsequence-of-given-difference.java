class Solution {
    public int longestSubsequence(int[] arr, int diff) {
       int ans=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int pre=arr[i]-diff;
           int len=map.getOrDefault(pre,0)+1;
           map.put(arr[i],len);
           ans=Math.max(ans,len);
       }
       return ans;
    }
}