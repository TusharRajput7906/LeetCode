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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(ListNode list:lists){
            while(list!=null){
                p.add(list.val);
                list=list.next;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(!p.isEmpty()){
            curr.next=new ListNode(p.remove());
            curr=curr.next;
        }
        return dummy.next;
    }
}