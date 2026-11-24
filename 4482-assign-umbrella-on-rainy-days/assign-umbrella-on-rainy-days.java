class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String ans[]=new String[n];
        int aliceReceived=0, bobReceived=0;
        for(int i=0;i<n-1;i++){
            if(rain[i]==rain[i+1] && rain[i]==1 && aliceReceived<=bobReceived){
                aliceReceived++;
                ans[i]="Alice";
            }else{
                if(rain[i]==0) {
                    ans[i]="None";
                    continue;

                }
                if(rain[i]==1){
                    ans[i]="Bob";
                    bobReceived++;
                }else{
                    aliceReceived++;
                    ans[i]="Alice";

                }
            }

        }
        if(rain[n-1]==0) ans[n-1]="None";
        // if(aliceReceived<bobReceived){
        //     ans[n-1]="Alice";
        // }
         else ans[n-1]="Bob";
        return ans;
    }
}