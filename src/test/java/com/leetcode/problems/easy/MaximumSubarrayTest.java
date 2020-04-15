package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MaximumSubarray 测试
 * Created by zeyuan on 2020/4/15.
 */
public class MaximumSubarrayTest {

    /**
     * 测试最大子序列
     */
    @Test
    public void testMaxSubArray(){

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        Assert.assertEquals(maximumSubarray.maxSubArray(nums),6);
    }
}
