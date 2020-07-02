package com.leetcode.problems.medium;

/**
 * 152. 乘积最大子数组 Maximum Product Subarray
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 * 示例1：
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 *
 * 示例2：
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * Created by zeyuan on 2020/7/2.
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {

        if(nums==null||nums.length==0){
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int currentMax = 1;
        int currentMin = 1;
        for(int i=0;i<nums.length;i++){
            //为负数则置换最大值和最小值
            if(nums[i]<0){
                int tmp = currentMax;
                currentMax = currentMin;
                currentMin = tmp;
            }
            currentMax = Math.max(currentMax*nums[i],nums[i]);
            currentMin = Math.min(currentMin*nums[i],nums[i]);
            max = Math.max(max,currentMax);
        }
        return max;
    }
}
