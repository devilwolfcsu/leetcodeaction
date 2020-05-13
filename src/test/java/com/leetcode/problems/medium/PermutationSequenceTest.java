package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * PermutationSequence 测试
 * Created by zeyuan on 2020/5/13.
 */
public class PermutationSequenceTest {

    @Test
    public void testGetPermutation(){

        PermutationSequence permutationSequence = new PermutationSequence();
        Assert.assertEquals(permutationSequence.getPermutation(3,3),"213");
        Assert.assertEquals(permutationSequence.getPermutation(4,9),"2314");
        Assert.assertEquals(permutationSequence.getPermutation(3,2),"132");
    }
}
