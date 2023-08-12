class Solution {
    public int[] findOriginalArray(int[] changed) {
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(changed);
        int k=0;
        int res[]=new int[changed.length/2];
        for(int i:changed){
            if(!q.isEmpty() && q.peek()==i){
                res[k]=q.poll()/2;
                k++;
            }else{
                q.add(i*2);
            }
        }
        if(q.size()>0){
            return new int[]{};
        }
        return res;
    }
}