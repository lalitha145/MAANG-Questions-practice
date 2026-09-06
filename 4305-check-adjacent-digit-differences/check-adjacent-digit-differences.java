class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int j=i+1; 
                if(Math.abs((s.charAt(i)-'0') - (s.charAt(j)-'0')) >2) return false;
            
        }
        return true;
    }
}