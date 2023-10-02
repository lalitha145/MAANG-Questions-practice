class Solution {
    public int subarrayBitwiseORs(int[] arr) {
       HashSet<Integer> s1=new HashSet<>();
       HashSet<Integer> s2=new HashSet<>();
       for(int i:arr){
           HashSet<Integer> s3=new HashSet<>();
           s3.add(i);
           for(int j:s2){
               s3.add(i|j);
           }
           s2=s3;
           s1.addAll(s2);
       }
       return s1.size();
    }
}