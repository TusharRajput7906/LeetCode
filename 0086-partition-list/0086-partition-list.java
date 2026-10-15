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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode small=dummy;
        ListNode dummy1=new ListNode(0);
        ListNode large=dummy1;
        while(temp!=null){
            ListNode next=temp.next;
            if(temp.val<x){
                small.next=temp;
                small=temp;
            }else{
                large.next=temp;
                large=temp;
            }
            temp.next=null;
            temp=next;
        }
        small.next=dummy1.next;
        return dummy.next;
    }
}