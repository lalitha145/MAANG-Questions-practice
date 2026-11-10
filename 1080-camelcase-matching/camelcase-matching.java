class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans=new ArrayList<>();
        for(String query: queries){
            if(isMatching(query,pattern)){
                ans.add(true);
            }else ans.add(false);
        }
        return ans;

    }
    boolean isMatching(String a, String b){
        int i=0,j=0;
        while(i<a.length() && j< b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else if(Character.isLowerCase(a.charAt(i))){
                i++;
            }else return false;
        }
        while(i<a.length()){
            if(!Character.isLowerCase(a.charAt(i))) return false;
            i++;
        }
        return i==a.length() && j==b.length();
    }

}