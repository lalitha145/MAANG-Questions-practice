class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        if(blocks.length()<k) return 0;
        for(int i=0;i<blocks.length()-k+1;i++){
            int cnt=0;
            for(int j=i;j<k+i;j++){
                if(blocks.charAt(j)=='W'){
                    cnt++;
                }
            }
            min=Math.min(min,cnt);
        }
        return min;
    }
}