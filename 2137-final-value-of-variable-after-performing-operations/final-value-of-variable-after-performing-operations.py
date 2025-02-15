class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        count=0
        for i in range(len(operations)):
            if operations[i]=="++X" or operations[i]=="X++": 
                count=count+1
            else:
                count=count-1
        return count
        