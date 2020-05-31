package com.leetcode.problems.medium;

/**
 * 2. 两数相加 Add Two Numbers
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * [示例]
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * Created by zeyuan on 2020/5/31.
 */
public class AddTwoNumbers {



    public class ListNode {
        int val;
        ListNode next;
         ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /** 进位符 */
        int carry = 0;
        ListNode pre = l1;
        ListNode current = l1;
        //以l1为参考进行加法运算
        while (current != null) {

            if (l2 == null) {
                break;
            }
            int result = current.val + l2.val + carry;
            current.val = result % 10;
            carry = result / 10;

            // l1 向下一个节点
            pre = current;
            current = current.next;

            // l2向下一个节点
            l2 = l2.next;
        }

        // 1. l1到了链表底, 或者l2到了链表底部

        if (current == null) {

            //拼接剩余部分
            pre.next = l2;
            current = l2;
        }

        while (current != null) {
            if (carry == 0) {
                break;
            }
            int result = current.val + carry;
            current.val = result % 10;
            carry = result / 10;
            pre = current;
            current = current.next;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            pre.next = node;
        }
        return l1;
    }
}
