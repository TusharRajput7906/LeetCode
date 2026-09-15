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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode even=null;
        ListNode odd=null;
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            // int val=temp.val;
            ListNode next=temp.next;
            if(i%2!=0){
                temp.next=even;
                even=temp;
            }else{
                temp.next=odd;
                odd=temp;
            }
            temp=next;
            i++;
        }
        even=reverse(even);
        odd=reverse(odd);
        ListNode odd1=odd;
        while(odd1.next!=null){
            odd1=odd1.next;
        }
        odd1.next=even;
        return odd;
    }
}