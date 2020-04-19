package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * HouseRobberII 测试
 * Created by zeyuan on 2020/4/19.
 */
public class HouseRobberIITest {

    @Test
    public void testRob(){

        HouseRobberII houseRobberII = new HouseRobberII();
        int[] nums = {2,3,2};
        Assert.assertEquals(houseRobberII.rob(nums),3);

        int[] newNums = {2,3,2,1,4};
        Assert.assertEquals(houseRobberII.rob(newNums),7);
    }
}
