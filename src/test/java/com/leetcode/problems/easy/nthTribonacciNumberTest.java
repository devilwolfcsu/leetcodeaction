package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * nthTribonacciNumber 测试
 * Created by zeyuan on 2020/4/16.
 */
public class nthTribonacciNumberTest {

    /**
     * 泰波那契数 测试
     */
    @Test
    public void testTribonacci(){

        nthTribonacciNumber nthTribonacciNumber = new nthTribonacciNumber();
        Assert.assertEquals(nthTribonacciNumber.tribonacci(4),4);
        Assert.assertEquals(nthTribonacciNumber.tribonacci(25),1389537);
    }
}
