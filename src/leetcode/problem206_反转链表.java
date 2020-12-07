package leetcode;

import leetcode.Structure.ListNode;

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
}
