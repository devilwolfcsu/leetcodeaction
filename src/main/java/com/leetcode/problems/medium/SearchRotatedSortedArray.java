package com.leetcode.problems.medium;

/**
 * 33. 搜索旋转排序数组 Search in Rotated Sorted Array
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * [示例1]
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 *
 * [示例2]
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 * Created by zeyuan on 2020/5/10.
 */
public class SearchRotatedSortedArray {


    public int search(int[] nums, int target) {

        if(nums==null||nums.length==0){
            return -1;
        }

        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            // 左半边处理
            if(nums[low] <= nums[mid]){ // 左半边是单调递增
                // 如果target 小于nums[mid] 但是 大于 nums[low] 则该数字可能存在于左半边
                if(nums[mid]>target&&nums[low]<=target){
                    high = mid;
                }else{
                    low = mid+1;
                }
            }else{// 左边非单调递减， 则右边是单调递减
                if(nums[mid+1]<=target&&nums[high]>=target){ // 则从右边查找
                    low = mid+1;
                }else{
                    high = mid;
                }
            }
        }
        return -1;
    }

}
