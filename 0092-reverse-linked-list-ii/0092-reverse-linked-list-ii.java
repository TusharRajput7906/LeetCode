class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null ||head.next==null || left == right) {
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        int i=1;
        while(curr!=null && i!=left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode startToPointer=prev;
        ListNode start=curr;
        prev=null;
        while(curr!=null && i!=right+1){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        start.next=curr;
        if(startToPointer!=null){
            startToPointer.next=prev;
        }else{
            return prev;
        }
        return head;
    }
}