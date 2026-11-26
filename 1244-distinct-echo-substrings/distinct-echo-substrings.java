class Solution {
    public int distinctEchoSubstrings(String text) {
        HashSet<String> set=new HashSet<>();
        int n=text.length();
        for(int start=0;start<n;start++){
            for(int end=start+1;end<n;end++){
                if((end-start)%2!=0){
                    if(isSame(start, end+1,text)) set.add(text.substring(start,end+1));
                }
            }
        }
        return set.size();
    }
    boolean isSame(int start, int end,String s){
        int mid=(start+end)/2;
       // System.out.println(s.substring(start,end));
        while(mid<end){
            if(s.charAt(start) !=s.charAt(mid)) return false;
            start++;
            mid++;
        }
        return true;
    }
}