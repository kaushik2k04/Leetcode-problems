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
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        

        int carry=0,sum=0;
        while(l1 !=null || l2!=null ){
            sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
            }
            if(l2!=null){
                sum=sum+l2.val;
            }
            ListNode newn=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newn;
            curr=newn;
            if(l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if(carry!=0){
            ListNode newnode2=new ListNode(carry);
            curr.next=newnode2;
        }

        return dummy.next;
            }
}