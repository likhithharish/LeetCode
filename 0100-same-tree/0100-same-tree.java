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
    String str;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        str = "";
        preOrder(p);
        String pStr = new String(str);
        str = "";
        preOrder(q);
        return (pStr.equals(str));
        
    }
    
    public void preOrder(TreeNode root){
        if(root != null){
            str += String.valueOf(root.val) +",";
            preOrder(root.left);
            preOrder(root.right);
        }else{
            str += "null,";
        }
    }
    
}