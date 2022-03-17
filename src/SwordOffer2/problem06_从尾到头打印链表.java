/**
 * 从尾到头打印链表
 */
package SwordOffer2;

import leetcode.Structure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class problem06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }

        return print;
    }

    /**
     * 递归
     *
     * @param head
     * @return
     */
    ArrayList<Integer> tmp = new ArrayList<>();

    public int[] reversePrint2(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    public void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

    public static void main(String[] args) {
        problem06_从尾到头打印链表 solution = new problem06_从尾到头打印链表();
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        int[] res = solution.reversePrint(head);
        System.out.println(Arrays.toString(res));
    }
}
