class Solution {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs,(a,b)->{
            if(a.length()==b.length()) return a.compareTo(b);
            return a.length()-b.length();
        });
        int i=strs.length-1;
        System.out.println(Arrays.toString(strs));
        while(i>=0){
            String temp=strs[i];
            if(i-1>=0 && temp.equals(strs[i-1])){
            while(i>=0 && temp.equals(strs[i])){
                i--;
            }
            }
            else{
                break;
            }
          
        }
        System.out.println("i "+i);
        for(int j=i;j>=0;j--){
            boolean b=true;
            for(int k=j+1;k<strs.length;k++){
                if( isSubstring(strs[j],strs[k]) ) {
                    b=false;
                    break;
                }
            }
            if(b) return strs[j].length();
        }
        return -1;
       
        
    }
    boolean isSubstring(String a, String b){
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)) {
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==a.length();
    }
}