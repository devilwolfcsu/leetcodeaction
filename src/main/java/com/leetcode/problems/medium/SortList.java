package com.leetcode.problems.medium;

import com.leetcode.problems.ListNode;

/**
 * 148. 排序链表 Sort List
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 * [示例1]
 *  输入: 4->2->1->3
 *  输出: 1->2->3->4
 *
 * [示例2]
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 *
 * Created by zeyuan on 2020/6/1.
 */
public class SortList {


    public ListNode sortList(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        // O（n）
        while(fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 此时slow为中间位置
        // 截断成2段
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        // left 与 right 为已经排序好的两个链表，合并已经排序好的链表
        ListNode result =  new ListNode(-1);
        ListNode current = result;
        while(left!=null&& right!=null){
            if(left.val<=right.val){
                current.next = left;
                current = left;
                left = left.next;
            }else{
                current.next = right;
                current =  right;
                right = right.next;
            }
        }
        if(right!=null){
            current.next = right;
        }
        if(left!=null){
            current.next = left;
        }
        return  result.next;
    }
}
