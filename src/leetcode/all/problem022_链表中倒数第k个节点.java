package leetcode.all;

import leetcode.Structure.ListNode;

public class problem022_链表中倒数第k个节点 {
    // 方法1 顺序查找
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode node = null;
        // 遍历得到链表的节点个数
        for (node = head; node != null; node = node.next) {
            n++;
        }
        for (node = head; n > k; n--) {
            node = node.next;
        }
        return node;
    }

    // 方法2 双指针
    public ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        //快指针先走k步
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
