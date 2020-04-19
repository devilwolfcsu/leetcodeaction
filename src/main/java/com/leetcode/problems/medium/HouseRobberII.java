package com.leetcode.problems.medium;

import java.util.Arrays;

/**
 * 213. 打家劫舍 II（House Robber II）
 * [题目]
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都围成一圈，这意味着第一个房屋和
 * 最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 *
 * [示例1]
 * 输入: [2,3,2]
 * 输出: 3
 * 解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 *
 * [示例2]
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * Created by zeyuan on 2020/4/19.
 */
public class HouseRobberII {

    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length ==2){
            return Math.max(nums[0],nums[1]);
        }

        // 将环形的房屋排列进行处理， 处理成 两个 一个是没有最后一个房间的偷窃方案，一个是没有第一个房间的偷窃方案
        //int[] oneSubNums = Arrays.copyOfRange(nums,0,nums.length-1);
        int onePrice = innerRob(Arrays.copyOfRange(nums,0,nums.length-1));
        int twoPrice = innerRob(Arrays.copyOfRange(nums,1,nums.length));
        return Math.max(onePrice,twoPrice);
    }

    /**  偷窃内部方法 */
    private int innerRob(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length ==2){
            return Math.max(nums[0],nums[1]);
        }
        int maxPrice = 0;// 默认第一家
        int nMinusOne = Math.max(nums[0],nums[1]);
        int nMinusTwo = nums[0];
        // f(n) = Math.max(f(n-1),f(n-2)+nums[i])
        for(int i = 2;i<nums.length;i++){

            maxPrice = Math.max(nMinusOne,nMinusTwo+nums[i]);
            nMinusTwo = nMinusOne;
            nMinusOne = maxPrice;
        }
        return maxPrice;
    }
}
