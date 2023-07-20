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
    // Method 1 - preOrder traverse and generate Strings and compare them.
    // Method 2 - dfs - recursion.
    String str;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // str = "";
        // preOrder(p);
        // String pStr = new String(str);
        // str = "";
        // preOrder(q);
        // return (pStr.equals(str));
        
        return dfs(p,q);
    }
    
    public boolean dfs(TreeNode p, TreeNode q){
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) return false;

        boolean left = dfs(p.left, q.left);
        boolean right = dfs(p.right, q.right);

        return left && right;
    }
    
    // public void preOrder(TreeNode root){
    //     if(root != null){
    //         str += String.valueOf(root.val) +",";
    //         preOrder(root.left);
    //         preOrder(root.right);
    //     }else{
    //         str += "null,";
    //     }
    // }
    
}