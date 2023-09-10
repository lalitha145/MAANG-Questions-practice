class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList();
        for( int i = 0 ; i< expression.length() ;i++ )
        {
            char ch = expression.charAt(i);
            if( ch == '*' || ch =='+' || ch =='-')
            {
                List<Integer> left = diffWaysToCompute( expression.substring(0,i));
                List<Integer> right = diffWaysToCompute( expression.substring(i+1,expression.length()));
                for( int l :  left )
                {
                    for( int r : right )
                    {
                        switch( ch )
                        {
                            case '+':result.add( l + r);
                                    break;
                            case '-':result.add( l-r);
                                    break;
                            case '*':result.add(l*r);
                                    break;
                        }
                    }
                }
            }
        }
    if( result.size() == 0 )
         result.add( Integer.parseInt( expression ) );
 
    return result;
    }
}