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
    // Method 1 : changing values
    // Method 2 : changing links 
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head, prevFirst = null; //(prevFirst = last elem of reversed k group)
        int total = 1;
        while(curr.next != null){
            total++;
            curr = curr.next;
        }
        
        curr = head;
        boolean isFirstpass = true;
        while(curr != null){
            ListNode first = curr, prev = null;
            int count =0;
            while(curr != null && count<k){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count ++;
            }
            
            total -= k;
            if(isFirstpass){
                head = prev;
                isFirstpass = false;
            }else{
                //add last elem of prev k group to newly reversed group
                prevFirst.next = prev;
            }
            prevFirst = first;
            if(total < k){
                //add remaining nodes to last if the rest list size is less than k 
                prevFirst.next = curr;
                break;
            }
        }
        return head;
    }
}