package com.leetcode.problems;

/**
 * 单链表排序
 * Created by zeyuan on 2020/8/8.
 */
public class ListNodeSort {

    public  ListNode sort(ListNode root){

        ListNode current = root;
        while(current.next!=null){
            current = current.next;
        }

        return quickSort(root,current);
    }

    private ListNode quickSort(ListNode begin,ListNode end){

        if(begin==null||end==null||begin==end){
            return begin;
        }
        ListNode first = begin;
        ListNode second = begin.next;
        int midVal = begin.val;
        while(second!=end.next&&second!=null){
            if(second.val<midVal){
                first = first.next;
                if(first!=second){
                    int tmp = first.val;
                    first.val = second.val;
                    second.val = tmp;
                }
            }
            second  = second.next;
        }
        if(begin !=first){
            int tmp = begin.val;
            begin.val = first.val;
            first.val = tmp;
        }
        quickSort(begin,first);
        quickSort(first.next,end);
        return begin;
    }
}
