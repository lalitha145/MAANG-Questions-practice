class NumberContainers {
    HashMap<Integer,PriorityQueue<Integer>> num_indices;
    HashMap<Integer,Integer> ind_number=new HashMap<>();
    public NumberContainers() {
       num_indices=new HashMap<>();
    }
    
    public void change(int index, int number) {
         if(ind_number.containsKey(index)){
           int prevNumber=ind_number.get(index);
           if(prevNumber==number) return;
           num_indices.get(prevNumber).remove(index); 
         }
         if(!num_indices.containsKey(number)){
            num_indices.put(number,new PriorityQueue<>());
         }
         num_indices.get(number).add(index);
         ind_number.put(index,number);
    }
    
    public int find(int number) {
        PriorityQueue<Integer> pq = num_indices.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */