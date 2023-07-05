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
    public ListNode reverseList(ListNode head) {
        // ListNode curr = head;
        // ListNode prev = null;
        // while(curr != null){
        //     ListNode next = curr.next;
        //     curr.next  = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // return prev;
        //Approach -2
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode curr= head; curr != null; curr = curr.next){
            list.add(curr.val);
        }
        for(ListNode curr=head; curr != null; curr = curr.next){
            curr.val = list.remove(list.size()-1);
        }
        return head;
    }
}