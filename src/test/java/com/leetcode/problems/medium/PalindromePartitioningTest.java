package com.leetcode.problems.medium;

import org.testng.annotations.Test;

import java.util.List;

/**
 * PalindromePartitioning 测试
 * Created by zeyuan on 2020/6/28.
 */
public class PalindromePartitioningTest {

    @Test
    public void testPartition(){

        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        List<List<String>> result =  palindromePartitioning.partition("aab");
        System.out.println(result);
    }
}
