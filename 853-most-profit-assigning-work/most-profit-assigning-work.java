class Pair{
    int difficulty;
    int profit;
    public Pair(int d, int p){
        difficulty=d;
        profit=p;
    }
}
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
      List<Pair> list=new ArrayList<>();
      int n=profit.length;
      for(int i=0;i<difficulty.length;i++){
        list.add(new Pair(difficulty[i],profit[i]));
      }
      Collections.sort(list,((a,b)->{
        return a.difficulty-b.difficulty;
      }));
       int i=0;
       Arrays.sort(worker);
       int ans=0;
       int best=0;
       for(int ability: worker){
         while(i<n && list.get(i).difficulty<=ability){
            best=Math.max(best,list.get(i).profit);
            i++;
         }
         ans+=best;

       }
       return ans;
    }
}