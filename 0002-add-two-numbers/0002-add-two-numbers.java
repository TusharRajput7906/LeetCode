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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int sum=0;
        int carry=0;
          ListNode curr=new ListNode(0);
        ListNode temp=curr;
        while(t1!=null && t2!=null){
            int s=t1.val+t2.val+carry;
            temp.next=new ListNode(s%10);
            temp=temp.next;
            carry=s/10;
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            int s=t1.val+carry;
            temp.next=new ListNode(s%10);
            temp=temp.next;
            carry=s/10;
            t1=t1.next;
        }
         while(t2!=null){
            int s=t2.val+carry;
            temp.next=new ListNode(s%10);
            temp=temp.next;
            carry=s/10;
            t2=t2.next;
        }
        if(carry>0){
            temp.next=new ListNode(carry%10);
            temp=temp.next;
        }

        return curr.next;
    }
}