package leetcode.all;

import leetcode.Structure.ListNode;

public class problem328_奇偶链表 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode evenHeaad = head.next;
        ListNode odd = head, even = evenHeaad;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHeaad;
        return head;
    }
}
