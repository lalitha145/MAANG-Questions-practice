
class Pair{
    int dsum, val, ind;
    public Pair(int a, int b, int c){
        dsum=a;
        val=b;
        ind=c;
    }
}
class Solution {
    public int minSwaps(int[] nums) {
        List<Pair> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(new Pair(findDsum(nums[i]),nums[i], i));
        }
        Collections.sort(l, (a,b)->{
            if(a.dsum==b.dsum) return Integer.compare(a.val,b.val);
            return Integer.compare(a.dsum,b.dsum);
        });
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(l.get(i).ind!=i){
                swap(l,i,l.get(i).ind);
                cnt++;
                i--;
            }
        }
        return cnt;

    }
    void swap(List<Pair> l, int i, int j){
        Pair temp=l.get(i);
        l.set(i,l.get(j));
        l.set(j,temp);
    }
    int findDsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}