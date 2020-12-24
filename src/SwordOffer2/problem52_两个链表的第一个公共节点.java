package SwordOffer2;

import leetcode.Structure.ListNode;

public class problem52_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode PA = headA;
        ListNode PB = headB;
        while (PA != PB) {
            PA = PA == null ? headB : headA.next;
            PB = PB == null ? headA : headB.next;
        }
        return PA;
    }
}
