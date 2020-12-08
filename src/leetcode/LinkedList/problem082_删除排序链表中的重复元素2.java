package leetcode.LinkedList;

import leetcode.Structure.ListNode;

public class problem082_删除排序链表中的重复元素2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.val == head.next.val) {
            while (head != null && head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head);
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }

    //    快慢指针
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode a = dummy;
        ListNode b = head;

        while (a.next != null && b.next != null) {
            if (a.next.val != b.next.val) {
                a = a.next;
                b = b.next;
            } else {
                while (b != null && b.next != null && a.next.val != b.next.val) {
                    b = b.next;
                }
                a.next = b.next;
                b = b.next;
            }
        }
        return dummy.next;
    }
}
