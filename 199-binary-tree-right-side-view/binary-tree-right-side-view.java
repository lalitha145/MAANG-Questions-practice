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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int lastNode=-1000;
            for(int i=0;i<size;i++){
                TreeNode poll=q.poll();
                lastNode=poll.val;
                if(poll.left!=null){
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    q.add(poll.right);
                }
            }
            if(lastNode!=-1000){
                ans.add(lastNode);
            }
        }
        return ans;
    }
}