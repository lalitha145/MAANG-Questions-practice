class Solution {
    public List<String> letterCombinations(String digits) {
    String a[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    if(digits.length()==0) return new ArrayList<>();
       List<String> ans=new ArrayList<>();
       helper(ans,digits,0,new StringBuilder(),a);
       return ans;

    }
    void helper(List<String> ans,String digits, int i,StringBuilder sb,String a[]){
        if(sb.length()==digits.length()) {
            ans.add(sb.toString());
            return;
        }
        int index=digits.charAt(i)-'0';
        for(int j=0;j<a[index-1].length();j++){
            sb.append(a[index-1].charAt(j));
            helper(ans,digits,i+1,sb,a);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}