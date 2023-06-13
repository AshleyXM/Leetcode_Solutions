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
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        // neither list1 nor list2 is null
        ListNode main, minor; // main is the main branch, and minor is the minor branch
        if(list1.val <= list2.val) {
            main = list1;
            minor = list2;
        } else {
            main = list2;
            minor = list1;
        }
        ListNode pmain = main;
        ListNode pminor = minor;
        while(pmain.next != null && pminor != null) {
            if(pminor.val >= pmain.val && pminor.val < pmain.next.val) {
                // insert the node pointed by pminor after the node pointed by pmain
                ListNode tmp = pminor; // store the current node pointed by pminor
                pminor = pminor.next; // make pminor point to the next node of pminor
                tmp.next = pmain.next; // make the next node of tmp be the next node of pmain
                pmain.next = tmp; // make the next node of pmain be tmp
                pmain = tmp; // make pmain point to tmp 
            } else {
                pmain = pmain.next; // move pmain point to the next node of itself
            }
        }
        if(pmain.next == null && pminor != null) {
            pmain.next = pminor;
        }
        return main;
    }
}