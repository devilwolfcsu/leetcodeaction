package com.leetcode.problems.easy;

import com.leetcode.problems.ListNode;

/**
 * 141. 环形链表 Linked List Cycle
 *
 * 给定一个链表，判断链表中是否有环。
 *
 * Created by zeyuan on 2020/6/2.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if(head==null||head.next==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            if(slow ==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}
