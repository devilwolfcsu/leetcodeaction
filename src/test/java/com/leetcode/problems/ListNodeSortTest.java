package com.leetcode.problems;

import org.testng.annotations.Test;

/**
 * 链表快排测试
 * Created by zeyuan on 2020/8/8.
 */
public class ListNodeSortTest {

    @Test
    public void testQuickSort(){

        ListNode root = createListNode(10);
        ListNode current = root;
        current.next  =  createListNode(1);
        current = current.next;
        current.next = createListNode(2);
        current = current.next;
        current.next = createListNode(11);
        current = current.next;
        current.next = createListNode(3);
        current = current.next;
        current.next = createListNode(14);
        current = current.next;
        current.next = createListNode(5);
        current = current.next;
        current.next = createListNode(19);
        current = current.next;
        current.next = createListNode(9);
        ListNodeSort listNodeSort = new ListNodeSort();
        ListNode sortedListNode = listNodeSort.sort(root);
        ListNode sortedCurrent = sortedListNode;
        while(sortedCurrent.next!=null){
            System.out.print(sortedCurrent.val+" --> ");
            sortedCurrent = sortedCurrent.next;
        }
        System.out.println(sortedCurrent.val);
    }

    private ListNode createListNode(int val){
     return new ListNode(val);
    }
}
