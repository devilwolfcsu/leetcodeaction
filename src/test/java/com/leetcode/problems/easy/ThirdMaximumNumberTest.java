package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * ThirdMaximumNumber 测试
 * Created by zeyuan on 2020/5/2.
 */
public class ThirdMaximumNumberTest {

    @Test
    public void testThirdMax(){

        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int[] arrays = {3, 2, 1};
        Assert.assertEquals(thirdMaximumNumber.thirdMax(arrays),1);
        int[] newArryas = {1, 2};
        Assert.assertEquals(thirdMaximumNumber.thirdMax(newArryas),2);
        int[] newArryasAgain = {2, 2, 3, 1};
        Assert.assertEquals(thirdMaximumNumber.thirdMax(newArryasAgain),1);

    }
}
