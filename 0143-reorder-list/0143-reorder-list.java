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
    //Method 1 : Using auxilary space of deque
    // Method 2: 
    public void reorderList(ListNode head) {
        // Deque<Integer> que = new ArrayDeque<>();
        // ListNode curr = head;
        // while(curr != null){
        //     que.addLast(curr.val);
        //     curr = curr.next;
        // }
        // que.removeFirst();
        // curr = head;
        // int count =0;
        // while(que.size()!=0){
        //     if(count%2==0){
        //         ListNode temp = new ListNode(que.removeLast());
        //         curr.next = temp;
        //         curr = temp;
        //     }else{
        //         ListNode temp = new ListNode(que.removeFirst());
        //         curr.next = temp;
        //         curr = temp;
        //     }  
        //     count+=1;
        // }
        ListNode curr = head;
        
        while(curr!= null && curr.next != null ){
            ListNode next = curr.next;
            ListNode last = getLast(head);
            if(last == next){
                curr.next = last;
                break;
            }
            curr.next = last;
            last.next = next;
            curr = next;
        }
    }
    
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" -> ");
        }
        System.out.println("");
    }
    
    public ListNode getLast(ListNode head){
        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        ListNode last = curr.next;
        curr.next = null;
        return last;
    }
}