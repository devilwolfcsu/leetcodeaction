package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * FindNthDigit 单元测试类
 * Created by zeyuan on 2020/4/14.
 */
public class FindNthDigitTest {


    @Test
    public void testFindNthDigit() {

        FindNthDigit findNthDigit = new FindNthDigit();
        Assert.assertEquals(3, findNthDigit.findNthDigit(3), "选取第3个数字时出错");
        Assert.assertEquals(0, findNthDigit.findNthDigit(11), "选取第11个数字时出错");
        Assert.assertEquals(2, findNthDigit.findNthDigit(36), "选取第36个数字时出错");
        Assert.assertEquals(2, findNthDigit.findNthDigit(38), "选取第38个数字时出错");
        Assert.assertEquals(9, findNthDigit.findNthDigit(999), "选取第999个数字时出错");
        Assert.assertEquals(5, findNthDigit.findNthDigit(365), "选取第365个数字时出错");
    }
}

