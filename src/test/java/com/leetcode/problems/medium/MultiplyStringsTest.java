package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MultiplyStrings 测试
 * Created by zeyuan on 2020/4/21.
 */
public class MultiplyStringsTest {

    @Test
    public void testMultiply(){

        MultiplyStrings multiplyStrings = new MultiplyStrings();
        Assert.assertEquals(multiplyStrings.multiply("2","3"),"6");
        Assert.assertEquals(multiplyStrings.multiply("123","456"),"56088");
        Assert.assertEquals(multiplyStrings.multiply("0","0"),"0");
        Assert.assertEquals(multiplyStrings.multiply("0","123"),"0");
        Assert.assertEquals(multiplyStrings.multiply("321","0"),"0");
    }
}
