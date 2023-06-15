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
    public ListNode middleNode(ListNode head) {
        // traverse the link list to get the total number of nodes
        int count = 0; // the total number of nodes
        ListNode tmp = head; // a pointer used to traverse
        while(tmp != null) {
            count++;
            tmp = tmp.next;
        }
        int i = 1; // a counter to mark the current position
        while(head != null) {
            if(i == count / 2 + 1) { // the index of the node which is wanted to be returned
                return head;
            }
            head = head.next;
            i++;
        }
        return head;
    }
}