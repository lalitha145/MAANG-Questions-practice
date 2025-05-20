class Solution {
    public String reorganizeString(String s) {
    int fre[]=new int[26];
    char res[]=new char[s.length()];
    int maxFre=0, ind=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        fre[c-'a']++;
    }
     for(int i=0;i< fre.length;i++){
        if(fre[i]>maxFre){
            maxFre=fre[i];
            ind=i;
        }
     }
     int resInd=0;
     if(maxFre> (s.length()+1)/2) return "";
     while(fre[ind]>0){
        res[resInd]=(char)(ind+'a');
        fre[ind]--;
        resInd+=2;
     }
     for(int i=0;i<26;i++){
        while(fre[i]>0){
            if(resInd>=s.length()){
                resInd=1;
            }
            res[resInd]=(char)(i+'a');
            fre[i]--;
            resInd+=2;
        }
     }
     return new String(res);

    
     
    }
}