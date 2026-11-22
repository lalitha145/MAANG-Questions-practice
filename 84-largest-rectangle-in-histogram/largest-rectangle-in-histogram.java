class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(stack.size()>0){
                left[i]=stack.peek()+1;
            }
             stack.push(i);
        }
        stack.clear();
     //   [0, 0, 2, 3, 2, 5]   [0, 0, 3, 3, 0, 0]
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(stack.size()>0){
                right[i]=stack.peek()-1;
            }
           if(stack.size()==0) right[i]=nums.length-1;
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,(right[i]-left[i]+1)*nums[i]);
        }

        System.out.println(Arrays.toString(left)+"   "+Arrays.toString(right));
        return ans;

    }
}