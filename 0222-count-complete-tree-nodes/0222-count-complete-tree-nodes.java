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
    // Method 1: Using a recursive sol to count left side and then right side add 1 to count the root of childs.
    // Method 2: Since complete, use count to get left height and right height, if balanced perfect no.of nodes= (2^lh)-1;
    public int countNodes(TreeNode root) {
        // if(root == null){
        //     return 0;
        // }
        // return countNodes(root.left)+ countNodes(root.right)+1;
        
        // Method 2:
        int lh = 0, rh = 0;
        TreeNode curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }
        if (lh == rh) {
            return (int) (Math.pow(2, lh) - 1);
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}