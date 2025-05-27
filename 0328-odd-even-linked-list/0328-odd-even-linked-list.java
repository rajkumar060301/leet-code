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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;
        ListNode curr = head;
        int i = 1;
        while(curr!=null){
            if(i%2==1){
                if(oddHead ==null){
                    oddHead = curr;;
                    oddTail = curr;

                }
                else{
                    oddTail.next = curr;
                    oddTail = oddTail.next;

                }

            }
            else{
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }
                else{
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            }
            curr = curr.next;
            i++;

        }
        evenTail.next = null;
        oddTail.next = evenHead;
        return oddHead;
        
    }
}