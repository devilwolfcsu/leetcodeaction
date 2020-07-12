package com.leetcode.problems.easy;

/**
 *  303. 区域和检索 - 数组不可变  Range Sum Query - Immutable
 *  示例
 *  给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *  sumRange(0, 2) -> 1
 *  sumRange(2, 5) -> -1
 *  sumRange(0, 5) -> -3
 *
 * Created by zeyuan on 2020/7/12.
 */
public class RangeSumQuery {


    private int[] sum;
    // dp[i][j] = dp[i][j-1] + nums[j]
    public RangeSumQuery(int[] nums){
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {

        return sum[j + 1] - sum[i];
    }
}
