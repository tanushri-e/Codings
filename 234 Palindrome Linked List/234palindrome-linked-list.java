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
    public boolean isPalindrome(ListNode head) 
    {
       ListNode fast=head,slow=head;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       } 

       ListNode p=null;
       while(slow!=null)
       {
        ListNode next=slow.next;
        slow.next=p;
        p=slow;
        slow=next;
       }

       ListNode fn=head,rn=p;
       while(rn!=null)
       {
        if(fn.val!=rn.val)
        {
            return false;
        }
        fn=fn.next;
        rn=rn.next;
       }
       return true;
    }
}