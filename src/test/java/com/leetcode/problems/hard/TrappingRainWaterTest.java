package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * TrappingRainWater 测试
 * Created by zeyuan on 2020/5/10.
 */
public class TrappingRainWaterTest {

    @Test
    public void testTrap(){
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(trappingRainWater.trap(height),6);
    }
}
