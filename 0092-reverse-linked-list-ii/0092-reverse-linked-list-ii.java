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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if(head== null || head.next == null || left ==right){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        
        while(left>1){
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        
        ListNode first = curr;
        ListNode conn = prev;
        ListNode nextNode = null;
        while(right>0 ){
            
            nextNode = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = nextNode;
            right--;
            
        }
        if (conn != null) {
            conn.next = prev;
        } else {
            head = prev;
        }

        first.next = curr;
        
       
        return head;
    }
}