package com.leetcode.problems.hard;

import com.leetcode.problems.ListNode;

/**
 * 23. 合并K个排序链表 Merge k Sorted Lists
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * [示例]
 * 输入:
 * [
 *  1->4->5,
 *  1->3->4,
 *  2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * Created by zeyuan on 2020/6/3.
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists==null||lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode result = mergeTwoLists(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            result = mergeTwoLists(result,lists[i]);
        }
        return result;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

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
