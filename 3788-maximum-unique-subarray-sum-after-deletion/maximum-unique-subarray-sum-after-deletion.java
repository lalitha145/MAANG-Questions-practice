class Solution {
    public int maxSum(int[] nums) {
       List<Integer> l=new ArrayList<>();
       HashSet<Integer> set=new HashSet<>();
       int sum=0,maxSum=Integer.MIN_VALUE;
       boolean f=false;
       int maxValue=Arrays.stream(nums).max().getAsInt();
       for(int ele:nums){
        if(ele<0) continue;
        if(set.contains(ele)) continue;
        set.add(ele);
        l.add(ele);
       }
       for(int i=0;i<l.size();i++){
        sum+=l.get(i);
       }
       if(l.size()==0) return maxValue;
       maxSum=Math.max(Math.max(maxSum,sum),maxValue);
       return maxSum;

    }
}

//5,5,6,7,8,5,-20,20,4