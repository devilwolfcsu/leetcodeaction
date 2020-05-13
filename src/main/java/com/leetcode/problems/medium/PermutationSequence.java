package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. 第k个排列 Permutation Sequence
 *
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 *   "123"
 *   "132"
 *   "213"
 *   "231"
 *   "312"
 *   "321"
 *  给定 n 和 k，返回第 k 个排列。
 * 说明：
 *  给定 n 的范围是 [1, 9]。
 *  给定 k 的范围是[1,  n!]。
 *
 *  [示例1]
 *  输入: n = 3, k = 3
 *  输出: "213"
 *  [示例2]
 *  输入: n = 4, k = 9
 *  输出: "2314"
 * Created by zeyuan on 2020/5/11.
 */
public class PermutationSequence {

    // n = [1,9]   k =[1,n!]
    public String getPermutation(int n, int k) {

        // 求 1-9 的阶乘 factorial[i] = i！
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        factorial[1] = 1;
        List<Integer> nums = new ArrayList();
        for(int i=0;i<n+1;i++){
            if(i>1){
                factorial[i] = factorial[i-1]*i;
            }
            nums.add(i+1);
        }
        k--;
        StringBuilder result = new StringBuilder();
        for (int i = n; i >= 1; --i) {
            int j = k / factorial[i-1];
            k %= factorial[i-1];
            result.append(nums.get(j));
            nums.remove(j);
        }
        return result.toString();
    }
}
