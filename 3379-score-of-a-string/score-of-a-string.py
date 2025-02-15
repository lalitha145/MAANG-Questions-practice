class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans=0
        for i in range(len(s)-1):
            temp=abs(ord(s[i])-ord(s[i+1]))
            ans=ans+temp
        return ans
        