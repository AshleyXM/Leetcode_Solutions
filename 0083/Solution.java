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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        // there is more than one node
        ListNode phead = head;
        while(phead.next != null) {
            if(phead.next.val == phead.val) { // duplicate node
                phead.next = phead.next.next; // set the next node to the next of the next node
            } else { // not duplicate
                phead = phead.next; // move the phead
            }
        }
        return head;
    }
}