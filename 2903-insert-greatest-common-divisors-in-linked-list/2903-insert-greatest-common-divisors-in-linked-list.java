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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       ListNode ans=new ListNode();
       ListNode res=ans.next;
       ListNode t1=head;
       ListNode t2=head.next;
       while(t2!=null){
          ListNode newNode=new ListNode(helper(t1.val,t2.val));
          t1.next=newNode;
          newNode.next=t2;
          t1=t1.next.next;
          t2=t2.next;


       }
         return head;      
    }
    static int helper(int a,int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }
}