package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Triangle 测试
 * Created by zeyuan on 2020/5/25.
 */
public class TriangleTest {

    @Test
    public void testMinimumTotal(){

        Triangle triangle = new Triangle();
        List<List<Integer>> params = new ArrayList<List<Integer>>();
        params.add(Arrays.asList(2));
        params.add(Arrays.asList(3,4));
        params.add(Arrays.asList(6,5,7));
        params.add(Arrays.asList(4,1,8,3));
        Assert.assertEquals(triangle.minimumTotal(params),11);
    }
}
