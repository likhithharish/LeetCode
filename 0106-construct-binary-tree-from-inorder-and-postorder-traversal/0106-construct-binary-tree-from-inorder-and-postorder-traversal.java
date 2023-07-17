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
    // Use postIndex to identify root by keeping a index from right to left in postorder arr, 
    // find the position of the root in inorder arr, left of it will be left subtree and right will be right subtree.
    //recursively call same method for left subtree and right subtree. 
    // Right sub tree first and then left subtree.
    public int postIndex;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length -1;
        return cTree(inorder, postorder, 0, postorder.length-1);
    }
    
    public TreeNode cTree(int[] inorder, int[] postorder, int is , int ie){
        if(is> ie){return null;}
        TreeNode root = new TreeNode(postorder[postIndex--]);
        
        int inIndex = is;
        for(int i=is; i<=ie; i++){
            if(inorder[i]== root.val){
                inIndex = i;
                break;
            }
        }
        root.right = cTree(inorder, postorder, inIndex+1, ie);
        root.left = cTree(inorder, postorder, is, inIndex -1);
        return root;
    }
}