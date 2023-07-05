/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        for(ListNode curr = head; curr !=null; curr = curr.next){
            if(set.contains(curr)){
                
                return curr;
            }
            set.add(curr);
        }
        return null;
    }
}