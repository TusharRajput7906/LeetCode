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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = null;
        ListNode curr = dummy;
        int i = 0;
        while (temp != null) {
            if (i % 2 == 0) {
                ListNode next = temp.next;
                temp.next = null;
                prev = temp;
                temp = next;
                i++;
            } else {
                ListNode next = temp.next;
                temp.next = null;
                curr.next = temp;
                temp.next = prev;
                curr = prev;
                prev = null;
                temp = next;
                i++;
            }
        }
        if (prev != null) {
            curr.next = prev;
        }
        return dummy.next;
    }
}