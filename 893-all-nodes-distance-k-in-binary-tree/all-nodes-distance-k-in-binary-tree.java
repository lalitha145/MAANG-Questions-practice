/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode poll=q.poll();
                if(poll.left!=null){
                    map.put(poll.left, poll);
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    map.put(poll.right, poll);
                    q.add(poll.right);
                }

            }
        }
        int dist=0;
         q.add(target);
         HashSet<TreeNode> vis=new HashSet<>();
         
         while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode poll=q.poll();
                if(!vis.contains(poll)){
                    vis.add(poll);
                if(poll.left!=null){
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    q.add(poll.right);
                }
                if(map.get(poll)!=null){
                    q.add(map.get(poll));
                }
                
                if(dist==k) ans.add(poll.val);
                }

            }
            dist++;
        }
        return ans;


    }
}