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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode curr=null;
        while(temp!=null){
            ListNode next=temp.next;;
            temp.next=curr;
            curr=temp;
            temp=next;
        }
        return curr;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp1=reverse(slow);
        while(temp1!=null){
            if(temp1.val!=temp.val) return false;
            temp1=temp1.next;
            temp=temp.next;
        }
        return true;
    }
}