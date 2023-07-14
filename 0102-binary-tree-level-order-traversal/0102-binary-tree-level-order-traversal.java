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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = height(root);
        List<List<Integer>> out = new ArrayList<>();
        for(int i=0; i< height; i++){
            List<Integer> temp = new ArrayList<>();
            out.add(printNodes(root, i, temp));
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