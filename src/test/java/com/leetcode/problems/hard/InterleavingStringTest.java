package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * InterleavingString 测试
 * Created by zeyuan on 2020/6/25.
 */
public class InterleavingStringTest {

    @Test
    public void  testIsInterleave(){

        InterleavingString interleavingString = new InterleavingString();
        Assert.assertEquals(interleavingString.isInterleave("aabcc","dbbca","aadbbcbcac"),true);
        Assert.assertEquals(interleavingString.isInterleave("aabcc","dbbca","aadbbbaccc"),false);
    }
}
