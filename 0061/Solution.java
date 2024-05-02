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
    public ListNode rotateRight(ListNode head, int k) {
        // special case
        if(head == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int count = 1;
        // count the number of nodes in the node list, and find the tail
        while(tail.next != null) {
            tail = tail.next;
            count++;
        }
        k = k % count;
        // find the new tail
        ListNode newTail = head;
        // move k times -> the (count - k)th node becomes the new tail
        for(int i = 0; i < count - k - 1; i++) {
            newTail = newTail.next;
        }
        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}