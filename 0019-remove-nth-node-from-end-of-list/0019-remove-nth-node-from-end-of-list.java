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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int l = size - n;
        if (l == 0)
            return head.next;
        ListNode t = head;
        for (int i = 0; i < l - 1; i++) {
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }
}