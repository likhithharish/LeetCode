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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode curr = head;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        if(count ==1){
            return null;
        }
        int pos = 1;
        int k = count - n + 1;
        curr = head;
        ListNode prev = null;
        while (curr.next != null) {
            if (pos == k) {
                break;
            }
            pos++;
            prev = curr;
            curr = curr.next;
        }
        ListNode nn = curr.next;
        if(prev==null){
            return nn;
        }
        prev.next = nn;
        return head;
    }
}