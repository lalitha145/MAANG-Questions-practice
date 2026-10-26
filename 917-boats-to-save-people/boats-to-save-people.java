class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0, right=people.length-1,boats=0;
        while(left<=right){
            if(people[right]+people[left]<=limit){
                boats++;
                left++;
                right--;
            }else{
                boats++;
                right--;
            }
        }
        return boats;
    }
}