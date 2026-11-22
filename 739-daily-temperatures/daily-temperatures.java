class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();

            }
            if(stack.size()>0){
                map.put(i,stack.peek());
            }
            stack.push(i);
        }
        for(int i=0;i<temperatures.length;i++){
            if(map.containsKey(i)){
                ans[i]=map.get(i)-i;
            }else{
                ans[i]=0;
            }
        }
        return ans;


    }
}