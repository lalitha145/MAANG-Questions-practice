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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            double cnt=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode poll=q.poll();
                cnt+=poll.val;
                if(poll.left!=null) q.add(poll.left);
                if(poll.right!=null) q.add(poll.right);

            }
            ans.add(cnt/size);
        }
        return ans;
    }
}