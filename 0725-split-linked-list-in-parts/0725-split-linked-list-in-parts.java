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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
        if(head==null){
            return ans;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int parts=len/k;
        int extra=len%k;
        ListNode curr=head;
        int ind=0;
        while(curr!=null){
            ListNode first=curr;
            int diff=extra<=0?0:1;
            for(int i=0;i<parts+diff-1;i++){
                curr=curr.next;
            }
            ListNode t=curr.next;
            curr.next=null;
            curr=t;
            ans[ind++]=first;
            extra--;

            
        }
        return ans;

        
    }
}