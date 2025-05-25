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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> s=new HashSet<>();
        List<TreeNode> ans=new ArrayList<>();
        for(int ele:to_delete) s.add(ele);
        helper(root,ans, s, true);
        return ans;
    }
    TreeNode helper(TreeNode node, List<TreeNode> ans, HashSet<Integer> s, boolean is_root){
        if(node==null) return null;
        boolean deleted=s.contains(node.val);
        if(is_root && !deleted){
            ans.add(node);
        }
        node.left=helper(node.left, ans, s, deleted);
        node.right=helper(node.right, ans, s, deleted);
        return deleted? null:node;
    } 
}