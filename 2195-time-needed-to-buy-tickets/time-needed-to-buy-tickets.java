class Pair{
    int ele, ind;
    public Pair(int ele, int ind){
        this.ele=ele;
        this.ind=ind;
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new Pair(tickets[i],i));
        }
        int time=0;
        while(!q.isEmpty()){
            Pair poll=q.poll();
            if(poll.ind==k && poll.ele==1){
                return time+1;
            }else{
                if(poll.ele>1){
                    q.add(new Pair(poll.ele-1,poll.ind));
                   
                }
            }
            time++;
        }
        return time;


    }
}