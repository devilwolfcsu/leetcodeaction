package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * HouseRobber 测试
 * Created by zeyuan on 2020/4/17.
 */
public class HouseRobberTest {

    @Test
    public void testRob(){
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {1,2,3,1};
        Assert.assertEquals(houseRobber.rob(nums),4);

        int[] newNums = {2,7,9,3,1};
        Assert.assertEquals(houseRobber.rob(newNums),12);

        int[] bigNums = {1,3,1,3,100};
        Assert.assertEquals(houseRobber.rob(bigNums),103);

        int[] anthoerNums = {2,1,1,2};
        Assert.assertEquals(houseRobber.rob(anthoerNums),4);
    }

}
