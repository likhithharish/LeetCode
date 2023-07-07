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
    public void reorderList(ListNode head) {
        Deque<Integer> que = new ArrayDeque<>();
        ListNode curr = head;
        while(curr != null){
            que.addLast(curr.val);
            curr = curr.next;
        }
        que.removeFirst();
        curr = head;
        int count =0;
        while(que.size()!=0){
            if(count%2==0){
                ListNode temp = new ListNode(que.removeLast());
                curr.next = temp;
                curr = temp;
            }else{
                ListNode temp = new ListNode(que.removeFirst());
                curr.next = temp;
                curr = temp;
            }  
            count+=1;
        }
    }
}