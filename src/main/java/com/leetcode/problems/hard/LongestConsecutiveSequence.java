package com.leetcode.problems.hard;

import java.util.HashSet;

/**
 * 128. 最长连续序列 Longest Consecutive Sequence
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 * [示例1]
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * Created by zeyuan on 2020/5/21.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }

        HashSet<Integer>  numsSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            numsSet.add(nums[i]);
        }
        int result =1;
        for(int i=0;i<nums.length;i++){
            //如果该数字存在序列中，则跳过
            if(numsSet.contains(nums[i]-1)){
                continue;
            }
            int currentLength = 1;
            int currentNum = nums[i];
            while(numsSet.contains(currentNum+1)){
                currentLength++;
                currentNum++;
            }
            if(result<currentLength){
                result  = currentLength;
            }
        }
        return result;
    }
}
