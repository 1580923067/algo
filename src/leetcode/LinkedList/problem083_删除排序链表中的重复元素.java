package leetcode.LinkedList;

import leetcode.Structure.ListNode;

public class problem083_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
