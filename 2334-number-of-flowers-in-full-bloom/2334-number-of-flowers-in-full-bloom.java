class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int start[]=new int[flowers.length];
        int end[]=new int[flowers.length];
        for(int i=0;i<flowers.length;i++){
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int res[]=new int[people.length];
         for (int i = 0; i < people.length; i++) {
            int startedBlooming = helper2(start, people[i]);
            int endBlooming = helper1(end, people[i]);
            res[i] = startedBlooming - endBlooming;
        }

        return res;
    }
    private int helper1(int[] flowers, int tar) {
        int low = 0, high = flowers.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (flowers[mid] >= tar) {
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return low;
    }

    private int helper2(int[] flowers, int tar) {
        int low = 0, high = flowers.length - 1;

        while (low <= high) {
            int mid = (low + high) >> 1;
            if (flowers[mid] <= tar) {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return low;
    }
}