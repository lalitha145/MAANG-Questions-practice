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
    inorder(ans,root);
    return ans;
}
void inorder(List<Integer> ans, TreeNode root){
    //if(root!=null && root.left==null && root.right==null) ans.add(root.val);
    if(root==null) return;
   // ans.add(root.val);
    inorder(ans,root.left);
    ans.add(root.val);
    inorder(ans,root.right);


}
}