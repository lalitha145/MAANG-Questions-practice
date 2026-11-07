class Solution {
    public int compress(char[] chars) {
        char prev=chars[0];
        int k=0;
        int currCnt=1;
        int ans=0;
        for(int i=1;i<chars.length;i++){
            char curr=chars[i];
            if(curr==prev){
                currCnt++;
            }
            else{
                chars[k++]=prev;
                ans++;
                prev=curr;
                
                if(currCnt==1) continue;
               
                    String temp=""+currCnt;
                    int j=0;
                    while(j<temp.length()){
                       chars[k]=temp.charAt(j);
                       System.out.println(k);
                        j++;
                        ans++;
                        k++;

                    }
                    currCnt=1;

                
            }
 
        }    


        chars[k]=prev;
        k++; 
        ans++;
                   
                   if(currCnt>1){
                    String temp=""+currCnt;
                    int j=0;
                    while(j<temp.length()){
                        chars[k]=temp.charAt(j);
                       j++;
                       k++;
                        ans++;
                    }
                   
        }

        return ans;
    }
    
    
}