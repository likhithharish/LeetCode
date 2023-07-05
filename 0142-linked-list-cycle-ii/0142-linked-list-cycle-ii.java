/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //Method 1 use a hashset.
    // Method 2 - use flyods effectively.
    public ListNode detectCycle(ListNode head) {
        /*HashSet<ListNode> set = new HashSet<>();
        for(ListNode curr = head; curr !=null; curr = curr.next){
            if(set.contains(curr)){ return curr;}
            set.add(curr);
        }
        return null;*/
       ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                break; 
            } 
        } 
        if(fast == null || fast.next==null){
            return null;
        }
        slow = head;
        while(slow != fast){ // not slow.next != fast.next we return the node , not break the loop
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}