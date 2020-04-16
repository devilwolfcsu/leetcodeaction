package com.leetcode.problems.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * ClimbStairs 测试
 * Created by zeyuan on 2020/4/16.
 */
public class ClimbStairsTest {

    /**
     *  测试N阶楼梯方法数
     */
    @Test
    public void testClimbStairs(){

        ClimbStairs climbStairs = new ClimbStairs();
        Assert.assertEquals(climbStairs.climbStairs(1),1);
        Assert.assertEquals(climbStairs.climbStairs(2),2);
        Assert.assertEquals(climbStairs.climbStairs(3),3);
        Assert.assertEquals(climbStairs.climbStairs(4),5);
        Assert.assertEquals(climbStairs.climbStairs(5),8);

    }
}
