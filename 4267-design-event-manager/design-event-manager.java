class Event{
    int id;
    int priority;
    public Event(int id, int p){
        this.id=id;
        priority=p;
    }
}
class EventManager {
    PriorityQueue<Event> pq;
     HashMap<Integer,Integer> map=new HashMap<>();

    public EventManager(int[][] events) {
        pq=new PriorityQueue<>((a,b)->{
            if(b.priority==a.priority){
                return a.id-b.id;
            }else{
                return b.priority-a.priority;
            }
        });
        for(int e[]:events){
            pq.add(new Event(e[0],e[1]));
            map.put(e[0],e[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        pq.add(new Event(eventId,newPriority));
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int topId=pq.peek().id;
            int p=pq.peek().priority;
            if(map.containsKey(topId) && map.get(topId)==p) {
                map.remove(topId);
                return topId;
            }
            else {
                pq.poll();
            }
        }
       
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */