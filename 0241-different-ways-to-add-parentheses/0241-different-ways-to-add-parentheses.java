class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='+' || c=='-' || c=='*'){
                List<Integer> left=diffWaysToCompute(s.substring(0,i));
                List<Integer> right=diffWaysToCompute(s.substring(i+1));
                for(int l:left){
                    for(int r:right){
                        switch(c){
                            case '+':
                                res.add(l+r);
                                break;
                            case '-':
                            res.add(l-r);
                            break;
                            case '*':
                            res.add(l*r);
                            break;
                        }
                    }
                }
            }
        }
        if(res.size()==0){
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}