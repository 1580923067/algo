package leetcode.all;

import leetcode.Structure.ListNode;

public class problem021_合并两个有序链表 {
    /**
     * 方法1 递归
     * list1[0]+merge(list1[1:],list2)  list1[0]<list2[0]
     * list2[0]+merge(list1,list2[1:])  otherwise
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    /**
     * 方法2 迭代
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1==null||l2==null){
            return l1==null?l2:l1;
        }

        ListNode prehead = new ListNode(-1 );
        ListNode prev = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            // 不管哪个节点接在了后面，prev都向后移动一位
            prev = prev.next;
        }
        //合并后，l1或l2还有剩余，直接添加到链表末尾
        prev.next = l1 == null ? l2 : l1;
        return prev.next;
    }
}
