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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode prev=null;
        ListNode curr=dummy;
        while(temp!=null){
            if(prev==null){
                prev=temp;
                temp=temp.next;
            }else if(temp.val==prev.val){
                while(temp!=null && temp.val==prev.val){
                    temp=temp.next;
                }
                prev=null;
            }else{
                curr.next=prev;
                curr=prev;
                prev.next=null;
                prev=null;
            }
        }
        if(prev!=null){
            curr.next=prev;
        }
        return dummy.next;
    }
}