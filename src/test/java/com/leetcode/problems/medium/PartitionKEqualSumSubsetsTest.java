package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * PartitionKEqualSumSubsets 测试类
 * Created by zeyuan on 2020/7/19.
 */
public class PartitionKEqualSumSubsetsTest {

    @Test
    public void testCanPartitionKSubsets(){
        int[] nums ={4,3,2,3,5,2,1};
        PartitionKEqualSumSubsets partitionKEqualSumSubsets = new PartitionKEqualSumSubsets();
        Assert.assertEquals(partitionKEqualSumSubsets.canPartitionKSubsets(nums,4),true);
    }
}

