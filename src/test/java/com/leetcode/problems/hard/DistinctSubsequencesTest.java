package com.leetcode.problems.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * DistinctSubsequences 测试
 * Created by zeyuan on 2020/6/20.
 */
public class DistinctSubsequencesTest {

    @Test
    public void testNumDistinct(){

        DistinctSubsequences distinctSubsequences = new DistinctSubsequences();
        Assert.assertEquals(distinctSubsequences.numDistinct("rabbbit","rabbit"),3);

        Assert.assertEquals(distinctSubsequences.numDistinct("babgbag","bag"),5);
    }
}
