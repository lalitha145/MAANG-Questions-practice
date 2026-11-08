class Solution {
    public int magicalString(int n) {
        if(n<=3) return 1;
        StringBuilder sb=new StringBuilder();
        sb.append("122");
        int ind=2;
        int currLen=3;
        char prev='2';
        while(currLen<n){
               char next=prev=='2'?'1':'2';
               int addCnt=sb.charAt(ind)-'0';
               while(addCnt>0){
                sb.append(next);
                currLen++;
                addCnt--;
               }
               prev=next;
               ind++;
               

        }
         int ans=0;
        for(int i=0;i<n;i++){
            if(sb.charAt(i)=='1') ans++;
        }
        System.out.println(sb.toString());
        return ans;
       
    }
}