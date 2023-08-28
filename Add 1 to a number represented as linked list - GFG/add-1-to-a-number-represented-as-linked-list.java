//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node temp=head;
        Node pre=null;
        Node curr=temp;
        while(curr!=null){
            Node next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        Node res=new Node(0);
        Node ans=res;
        
       
        int c=1;
        while(pre!=null || c!=0){
            int sum=0;
            if(pre!=null){
            sum=pre.data;
            }
            sum+=c;
            c=sum/10;
            res.next=new Node(sum%10);
            res=res.next;
            if(pre!=null){
            pre=pre.next;
            }
            
        }
        Node p1=null;
        Node c1=ans.next;
        while(c1!=null){
            Node n1=c1.next;
            c1.next=p1;
            p1=c1;
            c1=n1;
        }
        
        return p1;
        
        
        
    }
}
