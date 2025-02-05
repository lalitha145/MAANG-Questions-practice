/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans=new ArrayList<>();
    Stack<TreeNode> stack=new Stack<>();
    TreeNode curr=root;
    while(curr!=null || !stack.isEmpty()){
         while(curr!=null){
            stack.push(curr);
            curr=curr.left;
         }
         ans.add(stack.peek().val);
         curr=stack.pop();
         curr=curr.right;
    }
    return ans;
}
}