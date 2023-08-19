class Solution {
    public String digitSum(String s, int k) {
        if(s.length()==k){
            return s;
        }
        if(s.length()<k){
            return s;
        }
        String temp="";
        for(int i=0;i<s.length();i=i+k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                if(j<s.length())
                  sum+=Integer.parseInt(""+s.charAt(j));
            }
            temp+=sum;

        }
        return digitSum(temp,k);
    }
}