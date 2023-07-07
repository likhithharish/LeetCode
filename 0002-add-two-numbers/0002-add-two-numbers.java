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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        
        ListNode head2 = l2;
        
        int carryOn =0;
        int sum =0;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(head1 != null && head2 != null){
            
            sum = ((head1.val+head2.val+carryOn) %10 );
            carryOn = (head1.val+head2.val+carryOn)/10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head2==null && head1!= null){
            while(head1!=null){
            sum = ((head1.val+carryOn) %10 );
            carryOn = (head1.val+carryOn)/10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            head1 = head1.next;   
            }
        }
        if(head1==null && head2!= null){
            while(head2!= null){
            sum = ((head2.val+carryOn) %10 );
            carryOn = (head2.val+carryOn)/10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            head2 = head2.next;   
            }
        }
        if(carryOn >0){//handle carryon 
            while(carryOn>0){
                curr.next = new ListNode(carryOn %10);
                curr = curr.next;
                carryOn = carryOn /10;
            }
        }
        return res.next;
    }
    
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.println("");
    }
    
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}