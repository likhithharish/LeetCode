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
    }
    
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr!= null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println("");
    }
    
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode rest_head = reverse(head.next);
        ListNode rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
}