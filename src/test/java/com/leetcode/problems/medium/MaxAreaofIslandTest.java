package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MaxAreaofIsland 测试
 * Created by zeyuan on 2020/5/10.
 */
public class MaxAreaofIslandTest {

    @Test
    public void testMaxAreaOfIsland(){

        /***
         * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
         [0,0,0,0,0,0,0,1,1,1,0,0,0],
         [0,1,1,0,1,0,0,0,0,0,0,0,0],
         [0,1,0,0,1,1,0,0,1,0,1,0,0],

         [0,1,0,0,1,1,0,0,1,1,1,0,0],
         [0,0,0,0,0,0,0,0,0,0,1,0,0],

         [0,0,0,0,0,0,0,1,1,1,0,0,0],
         [0,0,0,0,0,0,0,1,1,0,0,0,0]]
         */
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
                };
        MaxAreaofIsland maxAreaofIsland = new MaxAreaofIsland();
        Assert.assertEquals(maxAreaofIsland.maxAreaOfIsland(grid),6);

        //[[0,0,0,0,0,0,0,0]]
        int[][] newGrid = {{0,0,0,0,0,0,0,0}};
        Assert.assertEquals(maxAreaofIsland.maxAreaOfIsland(newGrid),0);
    }
}
