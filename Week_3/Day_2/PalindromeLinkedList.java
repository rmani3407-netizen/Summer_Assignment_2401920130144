package Week_3.Day_2;
class ListNode  {
    int val;
    ListNode next;
    ListNode(int val){
        this.val= val;
        this.next=null;
    }

    
}

public class PalindromeLinkedList {
     public boolean isPalindrome(ListNode head) {
       ListNode slow=head, fast =head, prev= null;
       while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        ListNode next=slow.next;
        slow.next=prev;
        prev=slow;
        slow=next;
       } 
       if(fast!=null){
        slow= slow.next;
       }
       while(slow!=null){
        if(slow.val!=prev.val)return false;
        slow=slow.next;
        prev=prev.next;
       }
       return true;
    }
}
