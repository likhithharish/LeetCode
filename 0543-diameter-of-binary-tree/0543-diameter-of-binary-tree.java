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
    // Method 1 : for every node , compute height of its left subtree and right subtree and do it recursively for every node and return the maximum of it.
    // Method 2 : compute while computing height.
    
    public int res;
    public int diameterOfBinaryTree(TreeNode root) {
        // if(root == null){
        //     return 0;
        // }
        // int d1 = height(root.left) + height(root.right);
        // int d2 = diameterOfBinaryTree(root.left);
        // int d3 = diameterOfBinaryTree(root.right);
        // return Math.max(d1, Math.max(d2,d3));
        
        //Method 2
        if(root == null){return 0;}
        modifiedHeight(root);
        return res;
    }
    
    public int modifiedHeight(TreeNode root){
        if(root == null){return 0;}
        int lh = modifiedHeight(root.left);
        int rh = modifiedHeight(root.right);
        res = Math.max(res, lh+rh);
        return 1+Math.max(lh,rh);
    }
    
    // public int height(TreeNode root){
    //     if(root == null){
    //         return 0;
    //     }
    //     return Math.max(height(root.left), height(root.right))+1;
    // }
}