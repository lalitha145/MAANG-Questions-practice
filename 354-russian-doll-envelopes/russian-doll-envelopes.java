class Solution {
    public int maxEnvelopes(int[][] e) {
        Arrays.sort(e,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
    
       List<Integer> temp=new ArrayList<>();
       int len=0;
       for(int a[]:e){
        if(temp.size()==0){
            temp.add(a[1]);
            len++;
        }
        else{
            int ind=bs(temp,a[1]);
            System.out.println(ind+" ");
            if(ind==temp.size()) {
                temp.add(a[1]);
            }else{
                temp.set(ind,a[1]);
            }
         
        } 
        //System.out.println(temp+"  ");

       }
       return temp.size();
        
        
    }
    int bs(List<Integer> a, int t){
        int l=0, h=a.size()-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a.get(m)>=t){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}