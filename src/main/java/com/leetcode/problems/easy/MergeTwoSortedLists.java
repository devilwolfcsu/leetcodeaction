package com.leetcode.problems.easy;

/**
 * 21. 合并两个有序链表  Merge Two Sorted Lists
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * [示例]
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * Created by zeyuan on 2020/5/31.
 */
public class MergeTwoSortedLists {
    /** Definition for singly-linked list. */
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

         if(l1==null){
             return l2;
         }
         if(l2==null){
             return l1;
         }

         ListNode result =  new ListNode(-1);
         ListNode current = result;
         while(l1!=null&& l2!=null){
             if(l1.val<=l2.val){
                 current.next = l1;
                 current = l1;
                 l1 = l1.next;
             }else{
                current.next = l2;
                current =  l2;
                l2 = l2.next;
             }
         }
         if(l2!=null){
             current.next = l2;
         }
         if(l1!=null){
             current.next = l1;
         }
         return result.next;
    }
}
