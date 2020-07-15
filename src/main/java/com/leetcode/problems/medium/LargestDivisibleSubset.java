package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *  368. 最大整除子集  Largest Divisible Subset
 *  给出一个由无重复的正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (Si，Sj) 都要满足：Si % Sj = 0 或 Sj % Si = 0。
 *  如果有多个目标子集，返回其中任何一个均可。
 *
 *  示例1
 *  输入: [1,2,3]
 *  输出: [1,2] (当然, [1,3] 也正确)
 *
 *  示例2
 *  输入: [1,2,4,8]
 *  输出: [1,2,4,8]
 * Created by zeyuan on 2020/7/14.
 */
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        if(nums==null||nums.length==0){
            return new ArrayList<>();
        }
        // Test case with empty set.
        int n = nums.length;

        // Container to keep the size of the largest divisible subset
        //   that ends with each of the nums.
        Integer[] dp = new Integer[n];

        /* Sort the original list in ascending order. */
        Arrays.sort(nums);

        Integer maxSubsetSize = -1, maxSubsetIndex = -1;

        /* Calculate the rest of EDS(X_i) */
        for (int i = 0; i < n; ++i) {
            Integer subsetSize = 0;

            // Find the size of the largest divisible subset.
            for (int k = 0; k < i; ++k)
                if (nums[i] % nums[k] == 0 && subsetSize < dp[k])
                    subsetSize = dp[k];

            // Extend the found subset with the element itself.
            dp[i] = subsetSize + 1;

            // We reuse this loop to obtain the largest subset size
            //   in order to prepare for the reconstruction of subset.
            if (maxSubsetSize < dp[i]) {
                maxSubsetSize = dp[i];
                maxSubsetIndex = i;
            }
        }

        /* Reconstruct the largest divisible subset  */
        LinkedList<Integer> subset = new LinkedList();
        Integer currSize = maxSubsetSize;
        Integer currTail = nums[maxSubsetIndex];
        for (int i = maxSubsetIndex; i >= 0; --i) {
            if (currSize == 0) break;

            if (currTail % nums[i] == 0 && currSize == dp[i]) {
                subset.addFirst(nums[i]);
                currTail = nums[i];
                currSize -= 1;
            }
        }

        return subset;
    }
}
