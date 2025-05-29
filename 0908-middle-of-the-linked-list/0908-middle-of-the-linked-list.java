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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr =curr.next;
        }
        curr = head;
        int mid = (size/2);
        for(int i =1; i<= mid; i++){
            curr = curr.next;

        }
        
        return curr;
        
    }
}