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
    public boolean isPalindrome(ListNode head) {
        // DO NOT use String to store the val, otherwise it will exceed the time limit.
        // And using array to store will cost a large amount of unnecessary space. So avoid using it!
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int ph = 0;
        int pt = list.size() - 1;
        while(ph <= pt) {
            if(list.get(ph) != list.get(pt))
                return false;
            ph++;
            pt--;
        }
        return true;
    }
}