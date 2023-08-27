class Solution {
    public int addMinimum(String word) {
        int ans =0;
        for(int i =0; i < word.length();) {
            if(word.charAt(i) == 'a') 
            i++; 
            else
             ans++;
            if(i < word.length() && word.charAt(i) == 'b') 
            i++;
             else 
             ans++;
            if(i < word.length() && word.charAt(i) == 'c') {
                 i++;
            }else {
                       ans++; 
                    }
        }
        return ans;
    }
}