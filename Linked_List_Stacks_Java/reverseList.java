public class reverseList {
    ListNode head;
    ListNode prev=null;
    class ListNode{
        int data;
        ListNode next;
        ListNode prev;
        ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
//iterative approach
    public ListNode reverselist(ListNode head){
        ListNode current = head;
        while(current!=null){
            ListNode temp = current.next;
            current.next=prev;
            prev=current;
            current=temp;
           
        }return prev;
}   //recursive approach
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead = reverse(head.next);
        ListNode second = head.next;
        second.next=head;
        head.next=null;

        return newhead;
    }
    
}
