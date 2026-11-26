class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        int cnt=0;
        boolean alice=false;
        while(n-remove>=0){
            n-=remove;
            remove--;
            alice=!alice;
        }
        return alice;
    }
}