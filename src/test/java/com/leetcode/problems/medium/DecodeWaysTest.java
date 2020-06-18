package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DecodeWays 测试
 * Created by zeyuan on 2020/6/12.
 */
public class DecodeWaysTest {

    @Test
    public void testNumDecodings(){

        DecodeWays decodeWays  = new DecodeWays();
        Assert.assertEquals(decodeWays.numDecodings("12"),2);
        Assert.assertEquals(decodeWays.numDecodings("226"),3);
        Assert.assertEquals(decodeWays.numDecodings("0"),0);
        Assert.assertEquals(decodeWays.numDecodings("10"),1);
    }
}
