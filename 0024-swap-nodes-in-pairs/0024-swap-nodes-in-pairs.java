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
    //Method 1 - changing values
    // Method 2 - changing links
    public ListNode swapPairs(ListNode head) {
        // ListNode curr = head;
        // while(curr!=null && curr.next != null){
        //     int temp = curr.val;
        //     curr.val = curr.next.val;
        //     curr.next.val = temp;
        //     curr = curr.next.next;
        // }
        // return head;
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head.next.next;
        ListNode prev = head;
        //handle first two nodes
        head = head.next;
        head.next = prev;
        while(curr != null && curr.next!=null ){
            prev.next = curr.next;
            prev = curr;
            ListNode next = curr.next.next;
            curr.next.next= curr;
            curr = next;
        }
        prev.next = curr;
        return head;
    }
}