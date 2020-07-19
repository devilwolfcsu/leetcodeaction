package com.leetcode.problems.medium;


/**
 * 698. 划分为k个相等的子集  Partition to K Equal Sum Subsets
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 *
 * 示例1
 * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 * 输出： True
 * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 *
 * Created by zeyuan on 2020/7/17.
 */
public class PartitionKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        //
        int maxNum= nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(maxNum<nums[i]){
                maxNum = nums[i];
            }
        }
        if(sum%k!=0||sum/k<maxNum){
            return false;
        }
        int target = sum/k;
        boolean[] used = new boolean[nums.length];
        return backTracking(nums,k,target,0,0,used);

    }

    private boolean backTracking(int[] nums,int k,int target,int curNum,int start,boolean[] used){
        if(k==0){
            return true;
        }
        // 找到了一个分组，重新开始寻找下一个分组
        if(curNum==target){
            return backTracking(nums,k-1,target,0,0,used);
        }

       for(int i=start;i<nums.length;i++){
            //该元素未被使用过且和小与target，迭代
            if(!used[i]&&curNum+nums[i]<=target){
                used[i]=true;
                if(backTracking(nums,k,target,curNum+nums[i],i+1,used)){
                    return true;
                }
                used[i]=false;
            }
       }
       return false;
    }

}
