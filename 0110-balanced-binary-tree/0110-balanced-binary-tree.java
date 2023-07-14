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
    // get height of left sub tree and right subtree and compute abs diff , and do this for rest recursively.
    // Check height of leftsubtree and right subtree recursively(which returns -1 , if unbalanced).
    public boolean isBalanced(TreeNode root) {
//         if (root == null) {
//             return true;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//     }
    
//     public int height(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         return Math.max(height(root.left), height(root.right)) + 1;
        return checkBalance(root)!=-1;
    }
    
    public static int checkBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = checkBalance(root.left);
        if (lh == -1) {
            return -1;
        }
        int rh = checkBalance(root.right);
        if (rh == -1) {
            return -1;
        }
        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }
}