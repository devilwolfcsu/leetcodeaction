package com.leetcode.problems.medium;

import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素 （Kth Largest Element in an Array）
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * [示例1]
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 *
 * [示例2]
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * Created by zeyuan on 2020/5/2.
 */
public class KthLargestInArray {


    public int findKthLargest(int[] nums, int k) {

        if(nums==null || nums.length < k){
            return 0; // 如果数组为空， 或者数组数量小于K 直接返回0
        }
        PriorityQueue priorityQueue = new PriorityQueue(k);
        for(int i=0;i<nums.length;i++){
            if(priorityQueue.size()<k){
                priorityQueue.add(nums[i]);
            }else{
                Integer peekResult = (Integer)priorityQueue.peek();
                if(peekResult<nums[i]){
                    priorityQueue.poll();
                    priorityQueue.add(nums[i]);
                }
            }
        }
        Integer result = (Integer)priorityQueue.peek();
        return result;
    }
}
