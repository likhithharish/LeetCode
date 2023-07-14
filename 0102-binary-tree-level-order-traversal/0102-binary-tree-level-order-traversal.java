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
    // Method 1: find height and print at each level using recursion till you reach height.
    // Methdo 2: use a queue to add left and right , add the curr queue as list first and then add removed elem left and right at end of queue
    public List<List<Integer>> levelOrder(TreeNode root) {
        // int height = height(root);
        // List<List<Integer>> out = new ArrayList<>();
        // for(int i=0; i< height; i++){
        //     List<Integer> temp = new ArrayList<>();
        //     out.add(printNodes(root, i, temp));
        // }
        // return out;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> out = new ArrayList<>();
        if(root== null){
            return out;
        }
        q.add(root);
        int listCount =0;
        while(!q.isEmpty()){
            out.add(new ArrayList<Integer>());
            int size = q.size();
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
            listCount++;
        }
        return out;
    }
    
    public static List<Integer> printNodes(TreeNode root, int k, List<Integer> res) {
        if (root != null) {
            if (k == 0) {
                res.add(root.val);
            }
            printNodes(root.left, k - 1, res);
            printNodes(root.right, k - 1,res);
        }
        return res;
    }
    
     public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }
}