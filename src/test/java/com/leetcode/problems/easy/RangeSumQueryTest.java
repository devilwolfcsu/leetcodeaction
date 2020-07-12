package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * RangeSumQuery 测试
 * Created by zeyuan on 2020/7/12.
 */
public class RangeSumQueryTest {

    @Test
    public void testSumRange(){

        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);
        Assert.assertEquals(rangeSumQuery.sumRange(0,2),1);
        Assert.assertEquals(rangeSumQuery.sumRange(2,5),-1);
        Assert.assertEquals(rangeSumQuery.sumRange(0,5),-3);
    }
}
