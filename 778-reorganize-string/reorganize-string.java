class Solution {
    public String reorganizeString(String s) {
     int fre[]=new int[26];
     char ans[]=new char[s.length()];
     for(char c:s.toCharArray()){
        fre[c-'a']++;
     }
     int maxFre=0, maxFreIndex=0;
     for(int i=0;i<26;i++){
        if(maxFre<fre[i]){
            maxFre=fre[i];
            maxFreIndex=i;
        }
     }
     int i=0;
     if(maxFre>((s.length()+1)/2)) return "";
     while(fre[maxFreIndex]>0){
        ans[i]=(char)(maxFreIndex+'a');
        
        fre[maxFreIndex]--;
        i+=2;
     }
    
     for(int j=0;j<26;j++){
        if(fre[j]>0){
       while(fre[j]>0){
        if(i>=s.length()){
            i=1;
        }
        fre[j]--;
        ans[i]=(char)(j+'a');
        i+=2;
       }
        }
     }
     return new String(ans);

    }
}