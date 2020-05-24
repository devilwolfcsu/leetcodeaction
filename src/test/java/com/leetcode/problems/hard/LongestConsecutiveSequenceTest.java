package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestConsecutiveSequence 测试
 * Created by zeyuan on 2020/5/24.
 */
public class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutive(){
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] params = {100, 4, 200, 1, 3, 2};
        Assert.assertEquals(longestConsecutiveSequence.longestConsecutive(params),4);
    }

}
