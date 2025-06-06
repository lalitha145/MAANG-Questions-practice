class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans=0;
        for(int i=1;i<colors.length-1;i++){
            if(colors[i]!=colors[i+1] && colors[i]!=colors[i-1]) ans++;
        }
        if(colors[0]!=colors[1] && colors[0]!=colors[colors.length-1]) ans++;
        if(colors[colors.length-1]!=colors[colors.length-2] && colors[colors.length-1]!=colors[0]) ans++;
        return ans;
    }
}