class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder ans=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        for(int i=s.length()-1;i>=0;){

            if(s.charAt(i)==' '){
                String rev=temp.reverse().toString();
                System.out.println(rev);
                ans.append(rev);
                temp=new StringBuilder();
                ans.append(" ");
                while(i>=0 && s.charAt(i)==' '){
                    i--;
                }
            }else{
              temp.append(s.charAt(i));
              i--;
            }
        }
        if(temp.length()>0) ans.append(temp.reverse().toString());
        
        return ans.toString();
    }
}