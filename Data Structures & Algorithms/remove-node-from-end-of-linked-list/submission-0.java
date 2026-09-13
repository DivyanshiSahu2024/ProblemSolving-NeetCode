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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //if(head==null||head.next==null) return null;

        int count = 0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int index=count-n;

        if (index == 0) {
            return head.next;
        }

        ListNode prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;

    }
}
