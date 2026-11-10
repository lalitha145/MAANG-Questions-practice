class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary,(a,b)->{
            if(a.length()==b.length()) return b.compareTo(a);
            return a.length()-b.length();
        });
        System.out.println(dictionary);
        for(int i=dictionary.size()-1;i>=0;i--){
            if(helper(dictionary.get(i),s)){
                return dictionary.get(i);
            }
        }
        return "";
    }
    boolean helper(String a, String b){
        int i=0,j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==a.length();
    }
}