
class Solution {
    int ans=Integer.MAX_VALUE;
    public boolean isPower5(String s){
        long num = 0;
        num=Integer.parseInt(s,2);
        while(num > 1){
            if(num%5 != 0){
                return false;
            }
            num = num/5;
        }
        return num==1;
    }
    public void partition(int i, int n, String s, int curr){
        if(i >= n){
           ans=Math.min(ans,curr);
        }

        for(int j = i; j < n; j++){
            if(s.charAt(i) != '0' && isPower5(s.substring(i, j+1))){
                partition(j+1, n, s, curr+1);
            }
        }
    }
    public int minimumBeautifulSubstrings(String s) {
        partition(0, s.length(), s, 0);
     return ans==Integer.MAX_VALUE?-1:ans;
    }
}