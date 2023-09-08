public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode sp=head;
        ListNode fp=head;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp){
                return true;
            }
        }
        return false;
    }
}