package Week_3.Day_1;
class ListNode{
    int val;
    ListNode next;
    ListNode (int val){
        this.val=val;
        this.next=null;
    }
}

public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
