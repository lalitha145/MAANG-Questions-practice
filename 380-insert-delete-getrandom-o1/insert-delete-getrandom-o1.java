class RandomizedSet {
   HashMap<Integer,Integer> map;
       private Random rand=new Random();

   List<Integer> list;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int lastValue=list.get(list.size()-1);
        int index=map.get(val);
        list.set(index,lastValue);
        map.put(lastValue,index);
        map.remove(val);
        list.remove(list.size()-1);
        return true;

    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */