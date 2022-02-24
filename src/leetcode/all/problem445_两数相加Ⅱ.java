package leetcode.all;

import leetcode.Structure.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class problem445_两数相加Ⅱ {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();
        // 分别将l1、l2入栈
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();
            int curr = a + b + carry;
            carry = curr / 10;
            curr = curr % 10;
            ListNode curnode = new ListNode();
            curnode.next = ans;
            ans = curnode;
        }
        return ans;
    }
}
