/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    // Keep the node clone to its right for each node
    // Mark the random for the clones
    // Remove the clones into new ref and return it
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node next = null;
        // Add node clones with next ref only
        for(Node curr = head; curr != null;){
            next = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = next;
            curr = next;
        }
        
        // Add node clones with random ref
        for(Node curr = head; curr!= null; curr = curr.next.next){
            curr.next.random = (curr.random!=null) ? curr.random.next : null;
        }
        
        Node original = head;
        
        Node copy = (head.next!=null)? head.next : null;
        Node temp = copy;
        //Remove the clones
        while(original != null && copy!= null){
            original.next = (original.next!=null) ? original.next.next : original.next;
            copy.next = (copy.next!=null) ? copy.next.next : copy.next;
            
            original = original.next;
            copy = copy.next;
            
        }
        
        return temp;
        
    }
}