class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack=new Stack<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       int ans[]=new int[nums1.length];
       for(int i=nums2.length-1;i>=0;i--){

        while(!stack.isEmpty() && stack.peek()<nums2[i]){
            stack.pop();
            
        }
        if(stack.size()>0){
            map.put(nums2[i],stack.peek());
        }
        stack.push(nums2[i]);
       }
       for(int i=0;i<nums1.length;i++){
        ans[i]=map.getOrDefault(nums1[i],-1);
       }
       System.out.println(map);
       return ans;
    }
}