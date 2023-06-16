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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Suppose l1 as the main link list, which means putting the result into l1
        int cb = 0; // carry bit
        ListNode pl1 = l1;
        ListNode pl2 = l2;
        ListNode last = null;
        while(pl1 != null && pl2 != null) {
            if(pl1.next == null) // get the last element of l1
                last = pl1;
            int sum = (pl1.val + pl2.val + cb) % 10;
            cb = (pl1.val + pl2.val + cb) / 10;
            pl1.val = sum; // add to l1
            // move the pointers of l1 and l2
            pl1 = pl1.next;
            pl2 = pl2.next;
        }
        if(pl2 != null) { // pl1 == null, then concatenate the rest of l2 to l1
            last.next = pl2;
            pl1 = pl2;
        }
        while(pl1 != null) {
            if(pl1.next == null) // get the last element of l1
                last = pl1;
            int sum = (pl1.val + cb) % 10;
            cb = (pl1.val + cb) / 10;
            pl1.val = sum;
            pl1 = pl1.next;
        }
        if(cb != 0) {
            ListNode tmp = new ListNode(cb);
            last.next = tmp;
        }
        return l1;
    }
}