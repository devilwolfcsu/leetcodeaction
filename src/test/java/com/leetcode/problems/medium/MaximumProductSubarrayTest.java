package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * MaximumProductSubarray 测试
 * Created by zeyuan on 2020/7/2.
 */
public class MaximumProductSubarrayTest {

    @Test
    public void testMaxProduct(){

        MaximumProductSubarray maximumProductSubarray = new MaximumProductSubarray();
        int[] nums ={2,3,-2,4};
        Assert.assertEquals(maximumProductSubarray.maxProduct(nums),6);

        int[] numsNew = {-2,0,-1};
        Assert.assertEquals(maximumProductSubarray.maxProduct(numsNew),0);
    }
}
