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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) // 0 or 1 node
            return head;
        ListNode prev_node = head;
        ListNode cur_node = head.next;
        head.next = null; // DO NOT forget this step, otherwise there will be a cycle found
        while(cur_node.next != null) {
            ListNode tmp = cur_node.next;
            cur_node.next = prev_node;
            prev_node = cur_node;
            cur_node = tmp;
        }
        cur_node.next = prev_node;
        return cur_node;
    }
}