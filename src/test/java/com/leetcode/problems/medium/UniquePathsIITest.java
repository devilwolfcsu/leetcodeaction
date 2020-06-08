package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * UniquePathsII 测试
 * Created by zeyuan on 2020/6/8.
 */
public class UniquePathsIITest {

    @Test
    public void testUniquePathsWithObstacles(){

        UniquePathsII uniquePathsII = new UniquePathsII();

        int[][] path = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        Assert.assertEquals(uniquePathsII.uniquePathsWithObstacles(path),2);
    }
}
