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
    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode curr = null;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = curr;
            curr = temp;
            temp = next;
        }
        return curr;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = slow.next;
        slow.next = null;
        temp1 = reverse(temp1);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (temp1 != null) {
            ListNode next1 = temp.next;
            ListNode next2 = temp1.next;
            temp.next = temp1;
            temp1.next = next1;
            temp = next1;
            temp1 = next2;
        }
    }
}