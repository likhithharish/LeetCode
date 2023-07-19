/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Use preorder traversal to append the strings in serialize 
    // Again pre order traversal to reconstruct tree

    // Encodes a tree to a single string.
    
    public String serialize(TreeNode root) {
        return serial(root,"");
    }
    
    public String serial(TreeNode root, String str){
        if(root == null){
            str+= "null,";
        }else{
            str += String.valueOf(root.val) +",";
            str = serial(root.left, str);
            str = serial(root.right, str);
        }
        return str;
    }

    // Decodes your encoded data to tree.
    
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");   
        List<String> list = new LinkedList<String>(Arrays.asList(s));
        return deserial(list);
    }
    
    public TreeNode deserial(List<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        int value = Integer.valueOf(list.get(0));
        TreeNode root = new TreeNode(value);
        list.remove(0);
        root.left = deserial(list);
        root.right = deserial(list);
        return root;
    }
    
   
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));