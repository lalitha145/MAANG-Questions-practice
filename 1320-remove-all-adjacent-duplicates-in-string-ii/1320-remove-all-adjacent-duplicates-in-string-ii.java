class Pair{
    char letter;
    int count;
    public Pair(char l,int c){
        this.letter=l;
        this.count=c;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!stack.isEmpty()){
                if(c==stack.peek().letter){
                    int count=stack.peek().count+1;
                    stack.pop();
                    stack.push(new Pair(c,count));
                }else{
                    stack.push(new Pair(c,1));
                }
            }else{
                stack.push(new Pair(c,1));
            }
            if(stack.peek().count==k){
                stack.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            int count=stack.peek().count;
            while(count>0){
                ans.append(stack.peek().letter);
                count--;
            }
            stack.pop();
        }
        return ans.reverse().toString();
    }
}