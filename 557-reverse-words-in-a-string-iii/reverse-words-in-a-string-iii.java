class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String a[]=s.split(" ");
        for(String s1:a){
            StringBuilder sb=new StringBuilder(s1).reverse();
            ans.append(sb.toString());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}