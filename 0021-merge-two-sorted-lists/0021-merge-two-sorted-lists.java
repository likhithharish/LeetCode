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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!= null){
            return list2;
        }else if(list1!=null && list2== null){
            return list1;
        }
        if(list1==null && list2==null){
            return null;
        }
        ListNode a = list1;
        ListNode b = list2;
        ListNode head = null;
        if(a.val>b.val){
            head = b;
            b = b.next;
        }else{
            head =a;
            a = a.next;
        }
        ListNode curr = head;
        while(a != null && b!= null){
            if(a.val<b.val){
                head.next = a;
                head = a;
                a = a.next;
            }else{
                head.next = b;
                head = b;
                b = b.next;
            }
        }
        if(a== null && b!= null){
            while(b != null){
                head.next = b;
                head = b;
                b = b.next;
            }
        }else{
            while(a!=null){
                head.next = a;
                head = a;
                a = a.next;
            }
        }
        return curr;
    }
}