package com.leetcode.problems.medium;

import java.util.Arrays;

/**
 *
 *  279. 完全平方数 ( Perfect Squares )
 *  给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
 *  使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 *  示例1
 *  输入: n = 12
 *  输出: 3
 *  解释: 12 = 4 + 4 + 4.
 *
 *  示例2
 *  输入: n = 13
 *  输出: 2
 *  解释: 13 = 4 + 9.
 *
 * Created by zeyuan on 2020/7/12.
 */
public class PerfectSquares {

    public int numSquares(int n) {

        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // 计算平方数列表
        int max_square_index = (int) Math.sqrt(n) + 1;
        int square_nums[] = new int[max_square_index];
        for (int i = 1; i < max_square_index; ++i) {
            square_nums[i] = i * i;
        }

        // dp[i] = dp[i-s]+1  遍历i之前的每个完全平方数
        for (int i = 1; i <= n; ++i) {
            for (int s = 1; s < max_square_index; ++s) {
                if (i < square_nums[s])
                    break;
                dp[i] = Math.min(dp[i], dp[i - square_nums[s]] + 1);
            }
        }
        return dp[n];
    }
}
