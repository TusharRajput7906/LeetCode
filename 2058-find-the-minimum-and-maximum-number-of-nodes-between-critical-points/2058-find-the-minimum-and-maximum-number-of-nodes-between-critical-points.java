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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head.next;
        ListNode pre = head;
        int i = 2, j = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        while (temp.next != null) {
            if ((temp.val > pre.val && temp.val > temp.next.val) || (temp.val < pre.val && temp.val < temp.next.val)) {
                if (start == 0) {
                    start = i;
                    j = i;
                } else {
                    min = Math.min(min, i - j);
                    j = i;
                }
            }
            pre = temp;
            temp = temp.next;
            i++;
        }
        int max = j - start;
        if (max <= 0)
            max = -1;
        if (min == Integer.MAX_VALUE)
            min = -1;
        return new int[] { min, max };
    }
}