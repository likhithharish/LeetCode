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
    // Method 1: Using auxilary space of deque
    // Method 2: Using two while loops , getting last for each new formed list.(more TC)
    // Method 3: Reverse the second half of linked list and then one node from first half and one node from second half at a time.
    public void reorderList(ListNode head) {
        //METHOD 1
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
        //METHOD 2
//         ListNode curr = head;
        
//         while(curr!= null && curr.next != null ){
//             ListNode next = curr.next;
//             ListNode last = getLast(head);
//             if(last == next){
//                 curr.next = last;
//                 break;
//             }
//             curr.next = last;
//             last.next = next;
//             curr = next;
//         }
        //METHOD 3
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode curr = head;
        ListNode curr2 = reverseList(slow); // breaks the list into two and reverses second half
        while(curr2!= null && curr!=null){
            ListNode next = curr.next;
            ListNode next2 = curr2.next;
            curr.next = curr2;
            curr2.next = next;
            curr = next;
            curr2 = next2;
        }
    }
    
    public ListNode reverseList(ListNode head){
         ListNode d = null;
        
        while(head!=null)
        {
            ListNode nxt = head.next;
            head.next=d;
            d = head;
            head=nxt;
        }
        return d;
    }
    
    public void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
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