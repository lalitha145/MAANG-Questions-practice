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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return head.next;
        }
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int div=length/2;
        temp=head;
        while(div>1){
            temp=temp.next;
            div--;

        }
        if(temp.next==null){
            head.next=null;
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
}