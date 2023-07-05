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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head,prevFirst=null;
        boolean isFirstPass=true;
        int total = 1;
        ListNode cur = head;
        while (cur.next != null) {
            total++;
            cur = cur.next;
        }
        while(curr!=null ){
            ListNode first=curr,prev=null;
            int count=0;
           
            while(curr!=null && count<k){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            
            total -= k;
            
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
            if(total<k){//there are less than k elem at end,just add them
                prevFirst.next = curr;
                break;
            }
        }
        
        return head;
    }
}