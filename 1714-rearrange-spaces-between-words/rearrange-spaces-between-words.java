class Solution {
    public String reorderSpaces(String s) {
        List<String> l=new ArrayList<>();
        int spaces=0;
        for(int i=0;i<s.length();){
            if(s.charAt(i)==' ') spaces++;
            else{
            String temp="";
            while(i<s.length() && s.charAt(i)!=' '){
               temp+=s.charAt(i);
               i++;
            }
           
            if(temp.length()>0) l.add(temp);
            i--;
            }
            i++;
        }
        // System.out.println(spaces);
        int aveSpaces=0;
        StringBuilder ans=new StringBuilder();
        int extraSpaces=0;
        if(l.size()<=1){
            aveSpaces=spaces;
            extraSpaces=spaces;
        }else{
            aveSpaces=spaces/(l.size()-1);
            extraSpaces=spaces%(l.size()-1)==0?0:spaces%(l.size()-1);
        }
        System.out.println(extraSpaces);
        int n=1;
        for(int i=0;i<l.size();i++){
            if(i==l.size()-1) {
                ans.append(l.get(i));
                continue;
            }
            int tempSpaces=aveSpaces;
            ans.append(l.get(i));
            while(tempSpaces>0){
                ans.append(" ");
                tempSpaces--;
            }
        }
        while(extraSpaces>0){
            ans.append(" ");
            extraSpaces--;
        }

      
     
        return ans.toString();


    }
}