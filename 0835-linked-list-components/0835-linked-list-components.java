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
    public int numComponents(ListNode head, int[] nums) {

        //Store the nums vals as a 1 at each position of num[i] val
        int[] check = new int[10001];
        for(int i:nums){
            check[i]+=1;
        }

        int ans=0;
        int curStreak=0;
        while(head.next!=null){

            int curVal = head.val;
            int nextVal = head.next.val;

            if(check[curVal]==1){
                if(check[nextVal]==1){
                    curStreak++;
                }else{
                    ans+=curStreak;
                    curStreak=0;
                }
            }
            head=head.next;
        }
        ans+=curStreak;

        return nums.length-ans;
    }
}