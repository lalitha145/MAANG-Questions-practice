class DetectSquares {
    HashMap<List<Integer>, Integer> map;
    List<List<Integer>> pts;

    public DetectSquares() {
        map=new HashMap<>();
        pts=new ArrayList<>();
    }
    
    public void add(int[] point) {
        List<Integer> temp=Arrays.asList(point[0], point[1]);
        map.put(temp, map.getOrDefault(temp,0)+1);
        pts.add(temp);

    }
    
    public int count(int[] point) {
        int px=point[0], py=point[1];
        int res=0;
        for(List<Integer> p:pts){
            int x=p.get(0);
            int y=p.get(1);
            if(Math.abs(px-x)!=Math.abs(py-y)  || px==x || py==y){
                continue;
            }
            res+=map.getOrDefault(Arrays.asList(x,py),0)*map.getOrDefault(Arrays.asList(px,y),0);
        }
        return res;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */