package com.leetcode.problems.medium;

import org.testng.annotations.Test;

import java.util.List;

/**
 * ThreeSum 测试类
 * Created by zeyuan on 2020/5/1.
 */
public class ThreeSumTest {

    @Test
    public void testThreeSum(){

        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}
