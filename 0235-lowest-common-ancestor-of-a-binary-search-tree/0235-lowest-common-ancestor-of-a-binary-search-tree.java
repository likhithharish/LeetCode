/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // Method 1 : Generate paths for each p and q, return the last common elem in the paths 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        if (!findPath(root, path1, p.val) || !findPath(root, path2, q.val)) {
            return null;
        }
        
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++) {
            if (path1.get(i + 1).val != path2.get(i + 1).val) {
                return path1.get(i);
            }
        }
        if(path1.size()<path2.size()){
            if(path1.get(path1.size()-1).val == path2.get(path1.size()-1).val){
                return path1.get(path1.size()-1);
            }
        }
        if(path2.size()< path1.size()){
            if(path1.get(path2.size()-1).val == path2.get(path2.size()-1).val){
                return path1.get(path2.size()-1);
            }
        }
        return null;*/
        
        // Method 2
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode lca1 = lowestCommonAncestor(root.left, p, q);
        TreeNode lca2 = lowestCommonAncestor(root.right, p, q);
        if (lca1 != null && lca2 != null) {
            return root;
        }
        if (lca1 != null) {
            return lca1;
        } else {
            return lca2;
        }
        
    }
    
    public boolean findPath(TreeNode root, ArrayList<TreeNode> path, int n) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.val == n) {
            return true;
        }
        if (findPath(root.left, path, n) || findPath(root.right, path, n)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}