package com.leetcode.problems.easy;

import com.leetcode.problems.ListNode;

/**
 *
 * 160. 相交链表  Intersection of Two Linked Lists
 *
 * 编写一个程序，找到两个单链表相交的起始节点。
 * Created by zeyuan on 2020/6/3.
 */
public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode currentA = headA;
        int aLenght = 1;
        while(currentA.next!=null){
            currentA = currentA.next;
            aLenght++;
        }
        ListNode currentB = headB;
        int bLenght = 1;
        while(currentB.next!=null){
            currentB = currentB.next;
            bLenght++;
        }
        if(currentA != currentB){
            return null; // 不相交
        }
        currentA = headA;
        currentB = headB;
        if(aLenght>bLenght){
            int step = aLenght-bLenght;
            while(step>0){
                currentA = currentA.next;
                step--;
            }
        }
        if(aLenght<bLenght){
            int step = bLenght - aLenght;
            while(step>0){
                currentB = currentB.next;
                step--;
            }
        }
        while(currentA!=currentB){
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return currentA;
    }
}
