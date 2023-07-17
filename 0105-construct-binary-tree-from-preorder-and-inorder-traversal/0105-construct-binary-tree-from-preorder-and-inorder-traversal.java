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
    // Use preIndex to identify root by keeping a index, 
    // find the position of the root in inorder arr, left of it will be left subtree and right will be right subtree.
    //recursively call same method for left subtree and right subtree.
    public int preIndex =0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return cTree(preorder, inorder, 0, preorder.length-1);
    }
    
    public TreeNode cTree(int[] preorder, int[] inorder, int is, int ie){
        if(is > ie){return null;}
        TreeNode root = new TreeNode(preorder[preIndex++]);
        
        int inIndex = is;
        for(int i=is; i<=ie; i++){
            if(inorder[i]== root.val){
                inIndex =i;
                break;
            }
        }
        root.left = cTree(preorder,inorder, is, inIndex-1);
        root.right = cTree(preorder, inorder, inIndex+1,ie);
        
        
        return root;
    }
}