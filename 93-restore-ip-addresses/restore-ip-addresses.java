class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        helper(s,0,ans,"",0);
        return ans;
    }
    void helper(String s,int i,List<String> ans,String temp,int k){
        System.out.println("Tmep :"+temp);
        if(i==s.length() && k==4 ){
            ans.add(temp.substring(0,temp.length()-1));
            return;
        }
        for(int j=i;j<s.length();j++){
            String s1=s.substring(i,j+1);
            if(valid(s1)){
                helper(s,j+1,ans,temp+s1+".",k+1);
            }

        }

    }
    boolean valid(String s){
        if(s.length()>1 && s.charAt(0)=='0') return false;
        if(s.length()>3) return false;
        // System.out.println("S  :"+s);
        int val=Integer.parseInt(s);
        // return true;
        return val>=0 && val<=255;
       
    }
}