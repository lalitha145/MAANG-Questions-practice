class Solution {
    public int minimumSum(int num) {
        String a[]=new String[4];
        int i=0;
        while(num>0){
            a[i]=""+num%10;
            num=num/10;
            i++;

        }
        Arrays.sort(a,(a1,b)->(Integer.parseInt(a1+b))-Integer.parseInt((b+a1)));
        System.out.println(Arrays.toString(a));
        int ans=0;
        ans+=Integer.parseInt(a[0]+a[2]);
        ans+=Integer.parseInt(a[1]+a[3]);
        return ans;
    }
}