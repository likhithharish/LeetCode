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
    // Modify the solution of level order traversal , and compute max at every level and update res list.
    public List<Integer> largestValues(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int count = q.size();
            for(int i=0; i<count; i++){
                TreeNode curr = q.poll();
                if(curr!= null){
                    max = Math.max(curr.val, max);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}