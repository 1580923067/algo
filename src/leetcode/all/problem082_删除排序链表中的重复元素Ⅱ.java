package leetcode.all;

import leetcode.Structure.ListNode;

public class problem082_删除排序链表中的重复元素Ⅱ {
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
        // 上面两行，可以写成ListNode dummy = new ListNode(-1, head)
        ListNode a = dummy;
        ListNode b = head;

        while (a.next != null && b.next != null) {
            if (a.next.val != b.next.val) {
                a = a.next;
                b = b.next;
            } else {
                // a不为null且b不为null且a的值不等于b的值，则b指针后移
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
