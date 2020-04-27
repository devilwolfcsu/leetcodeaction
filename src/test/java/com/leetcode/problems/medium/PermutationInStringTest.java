package com.leetcode.problems.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * PermutationInString 测试类
 * Created by zeyuan on 2020/4/27.
 */
public class PermutationInStringTest {


    @Test
    public void testCheckInclusion(){
        PermutationInString permutationInString = new PermutationInString();
        Assert.assertEquals(permutationInString.checkInclusion("ab","eidbaooo"),true);
        Assert.assertEquals(permutationInString.checkInclusion("ab","eidboaoo"),false);
    }
}
