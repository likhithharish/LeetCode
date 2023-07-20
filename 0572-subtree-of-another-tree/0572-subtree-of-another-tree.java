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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        str = "";
        preOrder(root);
        String mainStr = new String(str);
        str ="";
        preOrder(subRoot);
        System.out.println(mainStr);
        System.out.println(str);
        return mainStr.contains(str);
    }
    
     public void preOrder(TreeNode root){
        if(root != null){
            str += "," + String.valueOf(root.val) ;
            preOrder(root.left);
            preOrder(root.right);
        }else{
            str += ",null";
        }
    }
}