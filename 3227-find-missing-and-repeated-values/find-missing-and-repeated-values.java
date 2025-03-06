class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                l.add(grid[i][j]);
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
       int miss=0;
        int rep=0;
        for(int i:l){
            if(map.get(i)==2){
                rep=i;
                break;
            }
        }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!l.contains(i)){
                miss=i;
            }
        }
        return new int[]{rep,miss};
        
    }
}