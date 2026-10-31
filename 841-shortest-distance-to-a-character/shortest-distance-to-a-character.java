class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            //char curr=s.charAt(i);
            int left=s.substring(0,i).lastIndexOf(c);
            int right=(s.substring(i,s.length()).indexOf(c));
            System.out.println(left+ "  "+right);
            if(left==-1) ans[i]=(right-i)+i;
            if(right==-1) ans[i]=(i-left);
            if(left!=-1 && right!=-1)
              ans[i]=Math.min(i-left, (right-i)+i);
        }
        return ans;
    }
}