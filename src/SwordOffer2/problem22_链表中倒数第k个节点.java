package SwordOffer2;

import leetcode.Structure.ListNode;

public class problem22_链表中倒数第k个节点 {
    public ListNode hetKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            if (former == null) return null;
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
