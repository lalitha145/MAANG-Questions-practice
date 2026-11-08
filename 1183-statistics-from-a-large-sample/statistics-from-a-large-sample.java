class Solution {
    public double[] sampleStats(int[] count) {
        double ans[]=new double[5];
        double max=0;
        double min=-1;
        int modeFre=0;
        double median=-1;
        int mode=0;
        int totalEle=0;
        double totalSum=0;
        for(int i=0;i<256;i++){
            if(count[i]>0){
                if(min==-1) min=(double)i;
                max=(double)i;
                if(count[i]>modeFre){
                    modeFre=count[i];
                    mode=i;
                }
                totalSum+=(double)i*count[i];
                totalEle+=count[i];
            }
        }
        ans[0]=min;
        ans[1]=max;
        ans[2]=(double)(totalSum)/totalEle;
        ans[4]=mode;
        if(totalEle%2==1){
            int target=(totalEle)/2+1;
            int cnt=0;
            for(int i=0;i<256;i++){
                 cnt+=count[i];
                 if(cnt>=target) {
                    median=i;
                    break;
                 }
            }
        }else{
            int target1=totalEle/2;
            int target2=target1+1;
            int m1=-1, m2=-1;
            int cnt=0;
            for(int i=0;i<256;i++){
                 cnt+=count[i];
                 if(m1==-1 && cnt>=target1) {
                    m1=i;
                    
                 }
                 if(cnt>=target2){
                    m2=i;
                    break;
                 }
                 
            }
            median=(m1+m2)/2.0;



        }
        ans[3]=median;
        return ans;


    }
}