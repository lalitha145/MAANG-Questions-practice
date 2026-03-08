class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        int max_you_can_reach = startFuel;

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int count = 0;
        int index = 0;

        while(max_you_can_reach < target){

            while(index < stations.length &&
                  stations[index][0] <= max_you_can_reach){

                pq.offer(stations[index][1]);
                index++;
            }

            if(pq.isEmpty())
                return -1;

            max_you_can_reach += pq.poll();
            count++;
        }

        return count;
    }
}