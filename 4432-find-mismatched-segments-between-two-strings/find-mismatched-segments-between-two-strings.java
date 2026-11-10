class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        String sub1="";
        String sub2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
              if(sub1.length()>0){
                temp.add(sub1);
                temp.add(sub2);
                ans.add(new ArrayList<>(temp));
                
                temp=new ArrayList<>();
                sub1="";
                sub2="";
              }
            }else{
                sub1+=s1.charAt(i);
                sub2+=s2.charAt(i);
            }

        }
        if(sub1.length()>0){
                temp.add(sub1);
                temp.add(sub2);
                ans.add(new ArrayList<>(temp));
               
        }
        return ans;
    
    }
}