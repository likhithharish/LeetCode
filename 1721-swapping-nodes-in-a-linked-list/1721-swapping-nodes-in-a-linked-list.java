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
    // count the total nodes in list
    // get first kth node  and last kth node = (count-k+1)th node
    // swap the values
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int total =1;
        while(curr.next != null){
            total ++;
            curr = curr.next;
        }
        
        int count =1;
        curr = head;
        while(curr.next != null){
            if(count == k){
                break;
            }
            count++;
            curr = curr.next;
        }
        
        count =1;
        ListNode curr2 = head;
        while(curr2.next != null){
            if(count == (total-k+1)){
                break;
            }
            count++;
            curr2 = curr2.next;
        }
        
        int temp = curr.val;
        curr.val = curr2.val;
        curr2.val = temp;
        
        return head;
    }
}