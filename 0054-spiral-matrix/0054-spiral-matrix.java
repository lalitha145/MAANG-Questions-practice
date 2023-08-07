public class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        
        List<Integer> res = new ArrayList<Integer>();
        if (m.length == 0) {
            return res;
        }
        int rb = 0;
        int re= m.length-1;
        int cb = 0;
        int ce = m[0].length - 1;
        
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){
                res.add(m[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++){
                res.add(m[i][ce]);
            }
            ce--;
            if(rb<=re){
                for(int i=ce;i>=cb;i--){

                    res.add(m[re][i]);
                }
                re--;

            }
            if(cb<=ce){
                for(int i=re;i>=rb;i--){
                    res.add(m[i][cb]);
                }
                cb++;
            }
        }
        return res;
    }
}