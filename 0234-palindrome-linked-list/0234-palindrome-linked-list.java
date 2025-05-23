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
    public boolean isPalindrome(ListNode head) {
        ListNode first = head;
        StringBuilder s = new StringBuilder();
        while(first != null){
            s.append(first.val);
            first = first.next;

        }
        return func(s.toString());

    }
    public boolean func(String s){
        int l =0, h = s.length()-1;
        while(l<h){
            if(s.charAt(l++) !=s.charAt(h--)){
                return false;
            }
        }
        return true;

    }
}