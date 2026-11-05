class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int temp[]=new int[3];
         temp[0]=a;
         temp[1]=b;
          temp[2]=c;
        Arrays.sort(temp);
        int x=temp[0];
        int y=temp[1];
        int z=temp[2];
        if(y-x==z-y && y-x==1) return new int[]{0,0};
        int min=getMin(x,y,z);
        int max=getMax(x,y,z);
        return new int[]{min, max};
    }
    int getMin(int x, int y, int z){
        if(y-x<=2 || z-y<=2) return 1;
        return 2;
         
    }
    int getMax(int x, int y, int z){
        return z-x-2;
    }
}