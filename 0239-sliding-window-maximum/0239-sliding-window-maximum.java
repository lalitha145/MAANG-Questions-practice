class Solution {
    // approch using monotonique queue and dequeue
    public int[] maxSlidingWindow(int[] nums, int k) {
        // null case
        if(nums == null || nums.length == 0) return new int[]{};
        
        // size of the array
        int n = nums.length;
        
        // result
        int[] result = new int[n - k + 1];
        
        // pointer for result
        int r = 0;
        
        // create a deque
        Deque<Integer> dq = new LinkedList<>();
        
        // go over all the elements
        for(int i = 0; i < n; i++) {
            // now remove out of the window element
            if(!dq.isEmpty() && dq.getFirst() < i - k + 1){
                dq.removeFirst();
            }
            // now monotonic stack
            // remove all the elements from the end if incoming element is 
            // greater
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i]){
                dq.removeLast();
            }
             // add element in the dequeue at last
            dq.addLast(i);
            // add first element in the result as it will be the largest
            if(i >= k - 1){
                result[r++] = nums[dq.getFirst()];
            }
        }
        return result;
    }
}