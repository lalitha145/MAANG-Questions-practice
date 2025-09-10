class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];

        for(int i=0;i<boxes.length();i++){
            int cnt=0;
           for(int j=0;j<boxes.length();j++){
             if(i==j) continue;
             if(boxes.charAt(j)=='1'){
              cnt+=Math.abs((j-i));
             }
           }
           ans[i]=cnt;
        }
        return ans;
    }
}