class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i =1;i<=n;i++)
        {
            if(check(i)==true)
            c++;
        }
        return c;
    }
    public boolean check(int i)
    {
        boolean ans = false;
        while(i>0)
        {
            int rem = i % 10;
            if(rem == 2)
            ans = true;
            if(rem == 5)
            ans = true;
            if(rem == 6)
            ans = true;
            if(rem == 9)
            ans = true;
            if(rem == 3)
            return false;
            if(rem == 4)
            return false;
            if(rem == 7)
            return false;
            i=i/10;
        }
        return ans;
    }
}