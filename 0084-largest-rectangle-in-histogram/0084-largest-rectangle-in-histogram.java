class Solution {
    public int largestRectangleArea(int[] heights) {

        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<heights.length;i++){
            if(stack.isEmpty()){
                left[i]=0;
            }else if(heights[stack.peek()]>=heights[i]){
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    left[i]=0;
                }else{
                    left[i]=stack.peek()+1;
                }
            }
            else{
                left[i]=stack.peek()+1;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            stack.pop();
        }
        for(int i=heights.length-1;i>=0;i--){
             if(stack.isEmpty()){
                 right[i]=heights.length-1;
             }
             else if(heights[stack.peek()]>=heights[i]){
                 while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                     stack.pop();
                 }
                 if(stack.isEmpty()){
                     right[i]=heights.length-1;
                 }else{
                     right[i]=stack.peek()-1;
                 }
             }else{
                 right[i]=stack.peek()-1;
             }
             stack.push(i);
        }
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            if(maxArea<(right[i]-left[i]+1)*heights[i]){
                maxArea=(right[i]-left[i]+1)*heights[i];
            }
        }
        return maxArea;
    }
}