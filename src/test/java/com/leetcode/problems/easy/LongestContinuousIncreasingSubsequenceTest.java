package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestContinuousIncreasingSubsequence 测试
 * Created by zeyuan on 2020/5/21.
 */
public class LongestContinuousIncreasingSubsequenceTest {

    @Test
    public void testFindLengthOfLCIS(){

        LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence();
        int[] params = {1,3,5,4,7};
        Assert.assertEquals(longestContinuousIncreasingSubsequence.findLengthOfLCIS(params),3);
        int[] newParams = {2,2,2,2,2};
        Assert.assertEquals(longestContinuousIncreasingSubsequence.findLengthOfLCIS(newParams),1);
        int[] newItems = {1,3,5,7};
        Assert.assertEquals(longestContinuousIncreasingSubsequence.findLengthOfLCIS(newItems),4);
    }
}
