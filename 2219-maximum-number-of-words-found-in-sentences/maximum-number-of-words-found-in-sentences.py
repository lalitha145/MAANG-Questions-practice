class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """

        maxSpace=1

        for i in range(len(sentences)):
            s=sentences[i]
            tempSpace=1
            for i in range(len(s)):
                if(s[i]==" "):
                    tempSpace+=1
               
            if(maxSpace<tempSpace):
                maxSpace=tempSpace
        return maxSpace

        