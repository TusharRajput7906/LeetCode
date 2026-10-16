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
        ListNode prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public int length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int len=length(head);
        if(len%2!=0 && k==(len/2 +1)){
            return head;
        }
        k = Math.min(k, len - k + 1);
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        slow.next=null;
        ListNode temp=head;
        ListNode temp1=newHead;
        while(k>1){
            temp=temp.next;
            temp1=temp1.next;
            k--;
        }
        int val=temp.val;
        temp.val=temp1.val;
        temp1.val=val;
        slow.next=reverse(newHead);
        // temp.next=newHead;
return head;
    }
}