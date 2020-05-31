package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestIncreasingSubsequence 测试
 * Created by zeyuan on 2020/5/31.
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void testLengthOfLIS(){

        int[] nums = {10,9,2,5,3,7,101,18};
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        Assert.assertEquals(longestIncreasingSubsequence.lengthOfLIS(nums),4);
    }
}
