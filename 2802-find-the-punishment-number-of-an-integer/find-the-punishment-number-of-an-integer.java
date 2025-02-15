class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            String s=String.valueOf(i*i);
            if(isPunishmentNumber(s,0,i)){
              ans+=(i*i);
            }
        }
        return ans;
    }
    boolean isPunishmentNumber(String s,int ind,int target){
        if(ind==s.length()) return target==0;
        int sum=0;
        for(int i=ind;i<s.length();i++){
            sum=sum*10+(s.charAt(i)-'0');
            if(sum>target)  break;
            if(isPunishmentNumber(s,i+1,target-sum)) return true;
        }
        return false;
    }
}