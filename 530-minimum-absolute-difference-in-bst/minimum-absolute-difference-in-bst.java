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
    int getMin(TreeNode root){
        return root.left!=null? getMin(root.left):root.val;
    }
     int getMax(TreeNode root){
        return root.right!=null? getMax(root.right):root.val;
    }
    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;
        if(root.left!=null){
            min=Math.min(min, root.val-getMax(root.left));
            min=Math.min(min, getMinimumDifference(root.left));
        }
        if(root.right!=null){
            min=Math.min(min, getMin(root.right)-root.val);
            min=Math.min(min, getMinimumDifference(root.right));
        }
        return min;
    }
}