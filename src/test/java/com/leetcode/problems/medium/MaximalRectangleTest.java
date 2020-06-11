package com.leetcode.problems.medium;

import com.leetcode.problems.hard.MaximalRectangle;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * MaximalRectangle 测试
 * Created by zeyuan on 2020/6/11.
 */
public class MaximalRectangleTest {

    @Test
    public void testMaximalRectangle(){

        char[][] martix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        MaximalRectangle maximalRectangle = new MaximalRectangle();
        Assert.assertEquals(maximalRectangle.maximalRectangle(martix),6);
    }
}
