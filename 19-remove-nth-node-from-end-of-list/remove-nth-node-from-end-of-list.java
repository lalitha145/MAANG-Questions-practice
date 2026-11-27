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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int nFromStart=len-n-1;
        if(nFromStart<0) return head.next;
        curr=head;
        for(int i=0;i<nFromStart;i++){
            curr=curr.next;
        }
        System.out.println(curr.val);
        if(curr.next==null) return null;
        if(curr.next.next!=null){
            curr.next=curr.next.next;
        }else{
            curr.next=null;
        }
        return head;
    }
}