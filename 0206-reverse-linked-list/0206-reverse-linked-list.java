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
        ListNode temp=head;
        ListNode dummy=null;
        while(temp!=null){
            ListNode t=temp.next;
            temp.next=dummy;
            dummy=temp;
            temp=t;
        }
        return dummy;
    }
}