package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * UglyNumber 测试
 * Created by zeyuan on 2020/7/3.
 */
public class UglyNumberTest {

    @Test
    public void testIsUgly(){

        UglyNumber  uglyNumber = new UglyNumber();
        Assert.assertEquals(uglyNumber.isUgly(6),true);
        Assert.assertEquals(uglyNumber.isUgly(8),true);
        Assert.assertEquals(uglyNumber.isUgly(14),false);
    }
}
