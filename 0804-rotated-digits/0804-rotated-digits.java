class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i);
            if(s.contains("2") ||s.contains("5") ||s.contains("6") || s.contains("9")){
                if(!s.contains("3") &&!s.contains("4") &&!s.contains("7")){
                    ans++;
                }
            }
        }
        return ans;
    }
}