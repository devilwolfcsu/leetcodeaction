package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MinimumPathSum 测试
 * Created by zeyuan on 2020/6/9.
 */
public class MinimumPathSumTest {

    @Test
    public void testMinPathSum(){

        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        Assert.assertEquals(minimumPathSum.minPathSum(grid),7);
    }
}
