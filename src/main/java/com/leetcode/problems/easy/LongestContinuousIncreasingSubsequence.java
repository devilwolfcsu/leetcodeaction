package com.leetcode.problems.easy;

/**
 *
 *  674. 最长连续递增序列 Longest Continuous Increasing Subsequence
 *  给定一个未经排序的整数数组，找到最长且连续的的递增序列。
 *  [示例1]
 *  输入: [1,3,5,4,7]
 *  输出: 3
 *  解释: 最长连续递增序列是 [1,3,5], 长度为3。
 *  尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。
 *
 *  [示例2]
 *  输入: [2,2,2,2,2]
 *  输出: 1
 *  解释: 最长连续递增序列是 [2], 长度为1。
 * Created by zeyuan on 2020/5/21.
 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int maxNum = 1;
        int currentNum = 1;
        int currentItem = nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentItem<nums[i]){
                currentItem = nums[i];
                currentNum++;
            }else{
                if(maxNum<currentNum){
                    maxNum = currentNum;
                }
                currentItem =nums[i];
                currentNum =1;
            }
        }
        if(maxNum<currentNum){
            maxNum = currentNum;
        }
        return maxNum;
    }
}
