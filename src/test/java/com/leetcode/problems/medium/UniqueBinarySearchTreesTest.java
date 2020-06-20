package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * UniqueBinarySearchTrees 测试类
 * Created by zeyuan on 2020/6/20.
 */
public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees(){

        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        Assert.assertEquals(uniqueBinarySearchTrees.numTrees(3),5);
    }
}
