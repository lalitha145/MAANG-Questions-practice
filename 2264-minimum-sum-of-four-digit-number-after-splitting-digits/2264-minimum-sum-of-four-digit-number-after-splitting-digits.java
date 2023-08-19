class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int i=0;
        int ans=0;
        while(num>0){
            a[i]=num%10;
            num=num/10;
            i++;
        }
        Arrays.sort(a);
        ans+=a[0]*10+a[2];
        ans+=a[1]*10+a[3];
        return ans;
    }
}