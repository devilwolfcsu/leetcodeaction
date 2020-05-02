package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * KthLargestInArray 测试
 * Created by zeyuan on 2020/5/2.
 */
public class KthLargestInArrayTest {


    @Test
    public void testKthLargestInArray(){
        KthLargestInArray kthLargestInArray = new KthLargestInArray();
        int[] arrays = {3,2,1,5,6,4};
        Assert.assertEquals(kthLargestInArray.findKthLargest(arrays,2),5);

        int[] newArrays = {3,2,3,1,2,4,5,5,6};
        Assert.assertEquals(kthLargestInArray.findKthLargest(newArrays,4),4);
    }
}
