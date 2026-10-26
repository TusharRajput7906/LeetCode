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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(l1!=null  && l2!=null){
            int sum=l1.val+l2.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10;
            l2=l2.next;
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        ListNode newHead=dummy.next;
        dummy.next=null;
        return reverse(newHead);
    }
}