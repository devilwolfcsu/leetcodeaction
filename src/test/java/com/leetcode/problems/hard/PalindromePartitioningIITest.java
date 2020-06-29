package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * PalindromePartitioningII 测试
 * Created by zeyuan on 2020/6/29.
 */
public class PalindromePartitioningIITest {

    @Test
    public void testMinCut(){
        PalindromePartitioningII palindromePartitioningII = new PalindromePartitioningII();
        Assert.assertEquals(palindromePartitioningII.minCut("aab"),1);
    }
}
