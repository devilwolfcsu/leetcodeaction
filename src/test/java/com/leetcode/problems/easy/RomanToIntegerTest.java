package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * RomanToInteger 测试
 * Created by zeyuan on 2020/4/14.
 */
public class RomanToIntegerTest {

    /**
     * 测试
     */
    @Test
    public void testRomanToIntNormal(){

        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("III");
        Assert.assertEquals(result,3);

        result = romanToInteger.romanToInt("IV");
        Assert.assertEquals(result,4);

        result = romanToInteger.romanToInt("IX");
        Assert.assertEquals(result,9);

        result = romanToInteger.romanToInt("LVIII");
        Assert.assertEquals(result,58);

        result = romanToInteger.romanToInt("MCMXCIV");
        Assert.assertEquals(result,1994);


        result = romanToInteger.romanToInt("DXX");
        Assert.assertEquals(result,520);

        result = romanToInteger.romanToInt("MCCCXIV");
        Assert.assertEquals(result,1314);

    }
}
