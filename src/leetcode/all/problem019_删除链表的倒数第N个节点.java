package leetcode.all;

import leetcode.Structure.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class problem019_删除链表的倒数第N个节点 {
    /**
     * 方法1，先计算链表的长度L，然后删除第L-n+1个节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;

    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    /**
     * 方法2，使用栈
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        //所有元素入栈
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        //弹出栈中的第n个元素，即链表的倒数第n个元素
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        //此时栈顶的元素即为弹出元素的前一个节点
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    /**
     * 方法3，一次遍历，快慢指针
     */
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

}
