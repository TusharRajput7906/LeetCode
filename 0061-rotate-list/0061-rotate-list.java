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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int len=0;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        len++;
        if(k>=len){
            k=k%len;
        }
        if(k==0) return head;
        int i=len-k;
        ListNode t=head;
        while(i>1){
            t=t.next;
            i--;
        }
        ListNode n=head;
        head=t.next;
        t.next=null;
        temp.next=n;
        return head;

    }
}