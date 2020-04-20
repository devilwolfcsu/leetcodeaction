package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * LongestCommonPrefix  测试类
 * Created by zeyuan on 2020/4/20.
 */
public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix(){

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        Assert.assertEquals(longestCommonPrefix.longestCommonPrefix(strs),"fl");

        String[] newStrs = {"dog","racecar","car"};
        Assert.assertEquals(longestCommonPrefix.longestCommonPrefix(newStrs),"");

    }
}
