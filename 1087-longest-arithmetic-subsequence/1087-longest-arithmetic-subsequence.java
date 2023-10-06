class Solution {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 2; 
        for (int i = 0; i < nums.length - 1; i++) { 
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i]; 
                int length = 2; 
                int current = nums[j]; 
                
                for (int k = j + 1; k < nums.length; k++) { 
                    if (nums[k] - current == diff) {
                        length++; 
                        current = nums[k]; 
                    }
                }
                maxLength = Math.max(maxLength, length); 
            }
        }       
        return maxLength;
    }
}