class Solution {
    public int nextGreaterElement(int n) {

        char a[]=String.valueOf(n).toCharArray();
        int inf=-1;
        for(int i=a.length-1;i>0;i--){
            if(a[i]>a[i-1]){
                inf=i;
                break;
            }
        }
        if(inf==-1) return -1;
        char toswap=a[inf-1];
        System.out.println(Arrays.toString(a));
        for(int i=inf;i<a.length;i++){
            if(a[i]>toswap){
                char t=a[i];
                a[i]=a[inf-1];
                a[inf-1]=t;
            }
        }

        System.out.println("After"+ Arrays.toString(a));
        Arrays.sort(a,inf,a.length);
        long ans=Long.parseLong(new String(a));
        if(ans>Integer.MAX_VALUE) return -1;
        return (int)ans;


    }
}