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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->(a.val-b.val));
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        ListNode t1[]=lists;
         for(int i=0;i<lists.length;i++){
             while(t1[i]!=null){
                 pq.add(t1[i]);
                 t1[i]=t1[i].next;
             }
         }
         while(pq.size()>0){
             ListNode poll=pq.poll();
             temp.next=new ListNode(poll.val);
             temp=temp.next;

         }

        return ans.next;
    }
}