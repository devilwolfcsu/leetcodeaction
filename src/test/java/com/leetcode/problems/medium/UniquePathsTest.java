package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * UniquePaths 测试
 * Created by zeyuan on 2020/6/8.
 */
public class UniquePathsTest {

    @Test
    public void testUniquePaths(){

        UniquePaths uniquePaths = new UniquePaths();
        Assert.assertEquals(uniquePaths.uniquePaths(3,2),3);
        Assert.assertEquals(uniquePaths.uniquePaths(7,3),28);
    }
}
