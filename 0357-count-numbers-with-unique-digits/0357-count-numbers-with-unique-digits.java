class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;

        }
        if(n==1){
            return 10;
        }
        int ans=10;
        int digit=9;
        int curr=9;
        while(n>1 && digit>0){
            curr=curr*(digit--);
            ans+=curr;
            n--;
        }
        return ans;
    }
}