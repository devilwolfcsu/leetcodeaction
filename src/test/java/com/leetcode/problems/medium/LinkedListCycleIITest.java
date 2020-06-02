package com.leetcode.problems.medium;

import com.leetcode.problems.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LinkedListCycleII 测试
 * Created by zeyuan on 2020/6/2.
 */
public class LinkedListCycleIITest {

    @Test
    public void testDetectCycle(){

        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        ListNode head = new ListNode(3);
        ListNode index = createNode(2);
        head.next = index;
        ListNode current = index;
        current.next = createNode(0);
        current = current.next;
        current.next = createNode(-4);
        current = current.next;
        current.next = index;
        ListNode result = linkedListCycleII.detectCycle(head);
        Assert.assertEquals(result.val,2);
    }

    private ListNode createNode(int value){
        return new ListNode(value);
    }
}
