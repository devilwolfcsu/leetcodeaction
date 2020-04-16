package com.leetcode.problems.easy;

/**
 * 53. 最大子序列（Maximum Subarray）  动态规划
 *
 * [题目]
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * [示例]
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * Created by zeyuan on 2020/4/15.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums){

        if(nums==null||nums.length==0){
            return 0;
        }
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i =1;i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
