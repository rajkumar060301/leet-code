package easyLevel;

import java.util.LinkedList;

class Q83_RemoveDuplicateSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val)
                curr.next = curr.next.next;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);

        list.addLast(3);


        //ystem.out.println(deleteDuplicates(list.getFirst()));

    }

}
