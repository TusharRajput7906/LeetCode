/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp1=headB;
        while(temp!=temp1){
           if (temp == null) {
                temp = headB;
            } else {
                temp = temp.next;
            }

            if (temp1 == null) {
                temp1 = headA;
            } else {
                temp1 = temp1.next;
            }
        }
        return temp;
    }
}