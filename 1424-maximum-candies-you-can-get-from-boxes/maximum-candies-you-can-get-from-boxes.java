class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int ans=0;
        int n=candies.length;
        boolean boxFound[]=new boolean[n];
        HashSet<Integer> used=new HashSet<>();

        Queue<Integer> q=new LinkedList<>();
        for(int box:initialBoxes){
            q.add(box);
            boxFound[box]=true;
        }
        while(!q.isEmpty()){
            int box=q.poll();
            if(status[box]==1 && !used.contains(box)){
            ans+=candies[box];
            
            used.add(box);
             for(int key:keys[box]){
               
                    status[key]=1;
                    if(boxFound[key]) q.add(key);
                
            }
           
                for(int containedBox:containedBoxes[box]){
                    q.add(containedBox);
                    boxFound[containedBox]=true;
                }
            
           
            }
        }
        return ans;
    }
}