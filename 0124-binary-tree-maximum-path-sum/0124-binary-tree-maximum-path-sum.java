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
    public int maxPathSum(TreeNode root) {
        int max[]=new int[1];
        max[0]=Integer.MIN_VALUE;
        helper(max,root);
        return max[0];
        
    }
    static int helper(int []max,TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Math.max(0,helper(max,root.left));
        int rh=Math.max(0,helper(max,root.right));
        max[0]=Math.max(max[0],lh+rh+root.val);
        return root.val+Math.max(lh,rh);
    }
}