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
    // Do level order traversal and for every odd levels , reverse the list once added.
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> out = new ArrayList<>();
        if(root == null){return out;}
        q.add(root);
        int listCount = 0;
        while(!q.isEmpty()){
            int size = q.size();
            out.add(new ArrayList<>());
            for(int i=0; i< size; i++){
                TreeNode curr = q.poll();
                out.get(listCount).add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            if(listCount%2 != 0){
                //reverse the list
                Collections.reverse(out.get(listCount));
            }
            listCount ++;
        }
        return out;
    }
}