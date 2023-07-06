/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // Method 1 : find second half of the list (using two pointers slow, fast) and reverse it. compare first half and second half . if value doesnt match return false.
    // Method 2: use deque and insert all the elem into it and 
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow.next);
        ListNode curr = head;
        while (rev != null) {
            if (rev.val != curr.val)
                return false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;
        //Method 2
//         Deque<Integer> deque = new ArrayDeque<>();
//         for(ListNode curr = head; curr != null; curr = curr.next){
//             deque.addFirst(curr.val);
//         }
        
//         for(ListNode curr = head; curr != null ; curr = curr.next){
//             if(curr.val != deque.removeFirst()){
//                 return false;
//             }
//         }
//         return true;
    }
    
    
    public ListNode reverse(ListNode head){
         ListNode d = null;
        
        while(head!=null)
        {
            ListNode nxt = head.next;
            head.next=d;
            d = head;
            head=nxt;
        }
        return d;
    }
}