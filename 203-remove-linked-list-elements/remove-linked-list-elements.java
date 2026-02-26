/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       
        ListNode curr=head;
        ListNode res=new ListNode(0);
        ListNode pre=res;
        res.next=head;
        

        pre.next=head;
        while(curr!=null){
          
            if(curr.val==val){
                pre.next=curr.next;
            }else{
                pre=curr;
            }
            curr=curr.next;

        }
        return res.next;
    }
}