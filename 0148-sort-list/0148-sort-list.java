class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Step 1: Split list into two halves
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;

        // Step 2: Sort both halves recursively
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);

        // Step 3: Merge both sorted halves
        return merge(leftSorted, rightSorted);
    }

    // Helper to find the middle of the list
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next; // Use fast.next to split evenly
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        current.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
