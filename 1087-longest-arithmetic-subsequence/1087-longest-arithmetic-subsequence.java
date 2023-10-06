class Solution {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 2; // Initialize the length of the longest arithmetic subsequence to 2
        
        for (int i = 0; i < nums.length - 1; i++) { // Loop through all pairs of elements in the array
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i]; // Calculate the difference between the two elements
                int length = 2; // Initialize the length of the current subsequence to 2
                int current = nums[j]; // Set the current element to the second element of the subsequence
                
                for (int k = j + 1; k < nums.length; k++) { // Loop through the remaining elements of the array
                    if (nums[k] - current == diff) { // Check if the next element is part of the subsequence
                        length++; // Increment the length of the subsequence
                        current = nums[k]; // Set the current element to the next element of the subsequence
                    }
                }
                
                maxLength = Math.max(maxLength, length); // Update the length of the longest subsequence if the current subsequence is longer
            }
        }       
        return maxLength;
    }
}