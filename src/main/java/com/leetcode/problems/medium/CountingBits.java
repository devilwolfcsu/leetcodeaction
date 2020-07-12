package com.leetcode.problems.medium;

/**
 *
 * 338. 比特位计数 Counting Bits
 *
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * 示例 1
 *  输入: 2
 *  输出: [0,1,1]
 *
 * 示例2
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 *
 * Created by zeyuan on 2020/7/12.
 */
public class CountingBits {
    // 时间复杂度要求  O(n)
    public int[] countBits(int num) {

        int[] result = new int[num + 1];
        for (int i = 1; i <= num; ++i)
            result[i] = result[i >> 1] + (i & 1); // x / 2 is x >> 1 and x % 2 is x & 1
        return result;
    }
}
