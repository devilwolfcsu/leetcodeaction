package com.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 414. 第三大的数(Third Maximum Number)
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * [示例1]
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1.
 *
 * [示例2]
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 *
 * [示例3]
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * Created by zeyuan on 2020/5/2.
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        // HashSet 去重
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            numsSet.add(nums[i]);
        }
        int[] newArrays = new int[numsSet.size()];
        int a = 0;
        for(int data : numsSet) {
            newArrays[a++] = data;
        }

        if(newArrays.length==1){
            return newArrays[0];
        }
        if(newArrays.length==2){
            return newArrays[0]>newArrays[1]?newArrays[0]:newArrays[1];
        }

        int first = newArrays[0];
        int second = newArrays[1];
        int third = newArrays[2]; // 第三大

        // 确保第二个数大于第三个数字
        if(second<third){
            int tmp = second;
            second = third;
            third = tmp;
        }
        // 确保第一个数字大于第二个数字
        if(first<second){
            int tmp = first;
            first = second;
            second = tmp;
        }
        if(second<third){
            int tmp = second;
            second = third;
            third = tmp;
        }
        // 遍历数组
        for(int i=3;i<newArrays.length;i++){
            if(newArrays[i] > third){
                third = newArrays[i];
            }
            if(second<third){
                int tmp = second;
                second = third;
                third = tmp;
            }
            // 确保第一个数字大于第二个数字
            if(first<second){
                int tmp = first;
                first = second;
                second = tmp;
            }
        }
        return third;
    }

}
