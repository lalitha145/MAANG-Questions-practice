class Solution {
    public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
       HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                s.add(i);
            }
        }
        for(int i=0;i<boxes.length();i++){
            ans[i]=helper(s,i);
        }

        return ans;
    }
    int helper(HashSet<Integer> s, int i){
        int ans=0;
        for(int ind:s){
            ans+=Math.abs(ind-i);
        }
        return ans;
    }
}