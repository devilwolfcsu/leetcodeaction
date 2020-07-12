package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * RangeSumQuery2D 测试
 * Created by zeyuan on 2020/7/12.
 */
public class RangeSumQuery2DTest {

    @Test
    public void testSumRegion(){

        int[][] matrix  ={
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        RangeSumQuery2D rangeSumQuery2D = new RangeSumQuery2D(matrix);
        Assert.assertEquals(rangeSumQuery2D.sumRegion(2,1,4,3),8);
        Assert.assertEquals(rangeSumQuery2D.sumRegion(1,1,2,2),11);
        Assert.assertEquals(rangeSumQuery2D.sumRegion(1,2,2,4),12);
    }

    @Test
    public void testEmptyMatrix(){
        int[][] matrix  ={};
        RangeSumQuery2D rangeSumQuery2D = new RangeSumQuery2D(matrix);
        Assert.assertEquals(rangeSumQuery2D.sumRegion(0,0,1,1),0);
    }
}
