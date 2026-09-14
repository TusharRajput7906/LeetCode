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
        // ListNode prev=null;
        ListNode curr=new ListNode(-1);
        while(temp!=null){
            // ListNode next=temp.next;
            ListNode ne=new ListNode(temp.val);
            ne.next=curr;
            curr=ne;
            temp=temp.next;
        }
        return curr;
    }
    public int len(ListNode head){
        int leng=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            leng++;
        }
        return leng;
    }
    public void reorderList(ListNode head) {
        // if(head==null || head.next==null) return head;
        ListNode newHead=reverse(head);
        ListNode temp=head;
        ListNode temp1=newHead;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int len=len(head);
        int l=len/2;
        while(l>0){
            ListNode next=temp.next;
            ListNode next1=temp1.next;
            t.next=temp;
            temp.next=null;
            t=t.next;
            t.next=temp1;
            temp1.next=null;
            t=t.next;
            temp=next;
            temp1=next1;
            l--;     
        }
        if(len%2!=0){
            t.next=temp;
            temp.next=null;
        }
    head=dummy.next;
    }
}