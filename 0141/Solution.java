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
    public boolean hasCycle(ListNode head) {
        // set two pointers: one moves faster, the other moves slower
        // if there is a cycle in it, the two pointers will collide into each other
        ListNode slow = head;
        ListNode fast = head;
        // if there is only one node
        if(fast == null || fast.next == null)
            return false;
        // if there are more than one nodes
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) // fast collides with slow
                return true;
        }
        return false;
    }
}