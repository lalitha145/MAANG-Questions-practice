class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int ans[]=new int[2];
        int temp[]=new int[3];
         temp[0]=a;
         temp[1]=b;
         temp[2]=c;
        Arrays.sort(temp);
      
        if(temp[0]+1==temp[1] && temp[1]+1==temp[2]) return new int[]{0,0};
        int max=(temp[2]-temp[1]-1) + (temp[1]-temp[0]-1);
          if(temp[1]==temp[0]+1 || temp[2]==temp[1]+1 || temp[2]-temp[1]<=2 || temp[1]-temp[0]<=2)  return new int[]{1,max};
        int val1=temp[1]-1;
        temp[0]=val1;
        Arrays.sort(temp);
        if(temp[0]+1==temp[1] && temp[1]+1==temp[2]) return new int[]{1,max};
        int val2=temp[1]+1;
        temp[0]=val2;
        Arrays.sort(temp);
        if(temp[0]+1==temp[1] && temp[1]+1==temp[2]) return new int[]{1,max};

        return new int[]{2,max};
    }
}