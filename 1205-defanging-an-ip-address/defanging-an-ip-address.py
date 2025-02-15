class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """

        a=""
        for i in address:
            if i==".":

                a=a+"[.]"
            else:
                a=a+i
        return a
