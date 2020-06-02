package com.leetcode.problems.easy;

import com.leetcode.problems.ListNode;

/**
 *
 * 206. 反转链表   Reverse Linked List
 *
 * 反转一个单链表。
 * [示例]
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * Created by zeyuan on 2020/5/31.
 */
public class ReverseLinkedList {


    public ListNode reverseList(ListNode head) {

        // 空或者只有一个元素 则直接返回
        if(head==null||head.next==null){
            return head;
        }

        ListNode preNode = head;
        ListNode tail = head;
        head = head.next;

        while(head!=null){
            ListNode tmp = head.next;
            head.next = preNode;
            preNode = head;
            head = tmp;
        }
        tail.next = null;
        return preNode;
    }
}
