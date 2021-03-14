package leetcode.all;

import leetcode.Structure.ListNode;

public class problem061_旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;

        //形成闭环
        ListNode old_tail = head;
        int n;
        for (n = 1; old_tail.next != null; n++) {
            old_tail = old_tail.next;
        }
        old_tail.next = head;

        //找到新的头结点
        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;

        new_tail.next = null;

        return new_head;
    }

    //    快慢指针
    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null) return null;
        ListNode fast = head, slow = head;
        //统计链表的长度，此时fast指向链表尾部
        int len = 1;
        while (fast.next != null) {
            len++;
            fast = fast.next;
        }
        fast.next = head; //闭环

        int step = len - k & len;
        //少移动一次，刚好指向新头结点的前一个节点
        while (step-- > 1) {
            slow = slow.next;
        }
        ListNode temp = slow.next;//新节点头
        slow.next = null;
        return temp;

    }
}
