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
    //Use four variables to represent odd list (start,end) and even list(start, end)
    // keep a count to check the index, if odd count (=odd index) add the curr to oddend.next and update odd end (vice versa for even). 
    // at last join odd end to even start and set even end to null
    public ListNode oddEvenList(ListNode head) {
        ListNode eS = null, eE = null, oS = null, oE = null;
        int count =1;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            if (count % 2 == 0) {
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                } else {
                    eE.next = curr;
                    eE = eE.next;
                }
            } else {
                if (oS == null) {
                    oS = curr;
                    oE = oS;
                } else {
                    oE.next = curr;
                    oE = oE.next;
                }
            }
            count++;
        }
        if (oS == null || eS == null)
            return head;
        oE.next = eS;
        eE.next = null;
        return oS;
        
    }
}