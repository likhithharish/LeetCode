/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // Swap the current node to last node and remember the last but one node in prev. mark prev.next to null.
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;
        while(curr.next != null){
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }
}