package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 15. 三数之和 (3Sum)
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。注意：答案中不可以包含重复的三元组。
 * [示例]
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *  满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * Created by zeyuan on 2020/4/28.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        // 数组为空或者数组元素小于3 直接返回空
        if(nums==null|| nums.length<3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        /* 对排序后的数组进行处理
         * [-1, 0, 1, 2, -1, -4]
         * 排序后  [-4,-1,-1,0,1,2]
         */
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0){
                //排序后 当前位置值大于0 ，则后续不可能出现 a+b+c=0 的情况 结束循环
                return result;
            }
            if(i!=0 && nums[i] == nums[i-1]){ // 对已经出现过的数字直接跳过 不再进行处理
                continue;
            }
            int second = i+1; // 从当前位置开始循环
            int third = nums.length-1; // 从尾部循环
            while(second<third){
               int sum = -(nums[second] + nums[third]);
               if(sum == nums[i]){ // 找到该数组
                    result.add(Arrays.asList(nums[i],nums[second],nums[third]));
                    while(second<third && nums[second] == nums[second+1]){
                        second++;
                    }
                    while(second<third && nums[third] == nums[third-1]) {
                        third--;
                    }
               }
               if(sum <= nums[i]){
                   third--;
               }else{
                   second++;
               }
            }
        }
        return result;
    }
}
