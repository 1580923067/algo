package leetcode.all;

import leetcode.Structure.ListNode;
import zuochengyun.chapter_2_listproblem.Problem_04_ReverseList;

public class problem206_反转链表 {
    /**
     * 迭代
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode p=reverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }

    public static void printLinkedList(ListNode head) {
        System.out.print("Linked List: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        problem206_反转链表 solution = new problem206_反转链表();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printLinkedList(head);
        printLinkedList(solution.reverseList2(head));
    }
}