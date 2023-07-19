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
    int size;
    int index;
    public TreeNode deserialize(String data) {
        index =0;
        String[] s = data.split(",");
        size = s.length;
        return deserial(s);
    }
    
    public TreeNode deserial(String[] s){
        if(index == size){return null;}
        
        int value = 0;
        if(s[index].equals("null")){
            index++;
            return null;
        }else{
            value = Integer.valueOf(s[index]);
        }
        index++;
        TreeNode root = new TreeNode(value);
        root.left = deserial(s);
        root.right = deserial(s);
        return root;
    }
   
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));